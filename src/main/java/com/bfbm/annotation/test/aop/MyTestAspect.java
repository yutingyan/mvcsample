package com.bfbm.annotation.test.aop;

import com.bfbm.annotation.test.Test;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Component
public class MyTestAspect {

    @Pointcut("@annotation(com.bfbm.annotation.test.Test)")
    public void annotationPointCut() {
        System.out.println("annotationPointCut");
    }


    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Test test = method.getAnnotation(Test.class);
        System.out.println("拦截:" + test.name());
    }

}
