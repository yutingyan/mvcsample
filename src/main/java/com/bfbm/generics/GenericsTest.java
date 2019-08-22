package com.bfbm.generics;

/**
 * A customized GenericsTest.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.1
 **/
public class GenericsTest {

    public interface Generic <T>{

    };

    class A implements Generic<String>{}

    //由于擦除的原因，一个类实现了同一泛型接口的变体。
    //class B extends A implements Generic<Long>{}

}
