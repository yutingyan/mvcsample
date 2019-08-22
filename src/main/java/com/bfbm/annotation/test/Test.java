package com.bfbm.annotation.test;

import org.aspectj.lang.annotation.Around;

import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method.
 * This annotation should be used only on parameterless static methods.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface Test {
    // method
    // normal
    // single element
    String name() default "test";

}


