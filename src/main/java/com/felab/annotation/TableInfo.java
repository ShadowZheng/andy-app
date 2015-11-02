package com.felab.annotation;

import java.lang.annotation.*;

/**
 * Created by azheng on 11/2/2015.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TableInfo {

    public String tableName();

    public String id();
}
