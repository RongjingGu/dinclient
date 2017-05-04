package com.ding.annotation;

import java.lang.annotation.*;

/**
 * Created by Gurongjing on 2017/4/28.
 * huifang company
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodInfo {
    String name() default "";
    String value() default "";
}
