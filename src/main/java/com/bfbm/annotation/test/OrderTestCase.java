package com.bfbm.annotation.test;

import org.springframework.stereotype.Component;

/**
 * A customized OrderTestCase.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.1
 **/
@Component
public class OrderTestCase {

    @Test(name="m1")
    public   void m1() {
        System.out.println("m1 method result");
    }

    public static  void m2() {}

    @Test(name="m3")
    public  void m3() {
        throw new RuntimeException("Boom");
    }

    public  void m4() { }

    @Test(name="m5")
    public  void m5() {
        System.out.println("m5 method result");
    }

    public static void m6() { }

    @Test(name="m7")
    public  void m7() {
        throw new RuntimeException("Crash");
    }

    public  void m8() { }

}
