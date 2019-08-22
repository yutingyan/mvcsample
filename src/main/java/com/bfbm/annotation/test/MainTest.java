package com.bfbm.annotation.test;

import com.bfbm.annotation.test.aop.AOPConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;


/**
 * A customized MainTest.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.1
 **/
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        OrderTestCase orderTestCase = context.getBean(OrderTestCase.class);
        int passed=0,failed=0;
       try{
            Method[] methods = Class.forName("com.bfbm.annotation.test.OrderTestCase").getDeclaredMethods(); // how many methods?
            for(Method m : methods) {
                if (m.isAnnotationPresent(Test.class)) {
                    try {
                        m.invoke(orderTestCase,null);
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                        failed++;
                    }
                }
            }
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.printf("Passed: %d, Failed %d%n", passed, failed);

    }

}
