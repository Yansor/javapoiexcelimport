package org.fsy.anotations;

/**
 *  Excel导入工具集注解
* Created by fushiyong on 2017/10/31.
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModelTitle{
 public String name();
}