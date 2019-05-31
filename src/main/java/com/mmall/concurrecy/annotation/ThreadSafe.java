package com.mmall.concurrecy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记线程安全的类或写法
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)    // 只是一个标注
public @interface ThreadSafe {

    String value() default "";
}
