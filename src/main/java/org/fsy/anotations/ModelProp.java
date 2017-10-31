package org.fsy.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excel导入工具集注解
 * Created by fushiyong on 2017/10/31.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ModelProp{
    public String name();
    public int colIndex() default -1;
    public boolean nullable() default true;
    public String interfaceXmlName() default "";
}
