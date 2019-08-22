package com.bfbm.generics;

/**
 * A customized starter service.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/06/02
 * @since v1.0
 **/
public class GenericTest2 <T extends GenericTest2<T>> {
    private T arg;

    public T get() {
        return arg;
    }

    public void set(T args) {
        arg = args;
    }

    static class B extends GenericTest2<B> {

    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.set(new B());
    }

}
