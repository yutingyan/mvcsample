package com.bfbm.annotation.test;

import java.lang.annotation.*;

/**
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.0
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface Usage {
    int get() default 1;
    String value()default "a";

    // other usages
    Class init() default Integer.class;
    Test  testCase() default  @Test;
  //  enum TYPE{} ;

 //   String[] strs() ;

    //String[][] lens(); //wrong
    //Usage u(); //wrong

}
