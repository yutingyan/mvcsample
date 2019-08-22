package com.bfbm.annotation.transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


import java.lang.reflect.Method;


@Aspect
@Component
public class MyAopTransaction {

    //异常通知
    @AfterThrowing("execution(* com.bfbm.annotation.transaction.service.*.*(..))")
	public void afterThrowing() {
		System.out.println("---回滚事务---");
	}

   //环绕通知 在方法之前和之后处理事情
	@Around("execution(* com.bfbm.annotation.transaction.service.*.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
        String transactionStatus = begin(pjp);
        //调用目标代理对象方法
        pjp.proceed();
        commit(transactionStatus);

	}

    /**
     * 判断事务状态,提交事务
     * @param transactionStatus
     */
    private void commit(String transactionStatus) {
        if (transactionStatus != null) {
            System.out.println("---提交事务---");

        }
    }


    /**
     * 判断是否有@MyTransactional事务注解,有的话开启事务
     * @param pjp
     * @return null或事务状态transactionStatus
     * @throws NoSuchMethodException
     */
	private String begin(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        //1,获取代理对象的方法
        MyTransactional myTransactional = getLpTransactional(pjp);
        if (myTransactional != null) {
            //2,加了的话开始事务
            System.out.println("---开启事务---");
        }
        String transactionStatus = "1";
        return transactionStatus;
    }

    /**
     * 获取代理对象的方法,判断是否有@MyTransactional事务注解
     * @param pjp
     * @return null或者MyTransactional对象
     * @throws NoSuchMethodException
     */
	private MyTransactional getLpTransactional(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        // 获取方法名称
        String methodName = pjp.getSignature().getName();
        // 获取目标对象
        Class<?> classTarget = pjp.getTarget().getClass();
        // 获取目标对象类型
        Class<?>[] par = ((MethodSignature) pjp.getSignature()).getParameterTypes();
        // 获取目标对象方法
        Method objMethod = classTarget.getMethod(methodName, par);
        MyTransactional myTransactional = objMethod.getDeclaredAnnotation(MyTransactional.class);
        return myTransactional;
    }
}
