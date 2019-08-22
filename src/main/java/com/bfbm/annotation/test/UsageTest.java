package com.bfbm.annotation.test;

import com.bfbm.annotation.test.aop.AOPConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * A customized starter service.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/16
 * @since v1.0
 **/
public class UsageTest {
    @Usage
    class A {
          class B {}
    }

    @Test A x;


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        OrderTestCase orderTestCase = context.getBean(OrderTestCase.class);
        orderTestCase.m1();
        context.close();
    }
}
