package com.mylog.code.annotation;
import java.lang.annotation.*;  
  
@Target({ElementType.METHOD, ElementType.TYPE})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
public @interface DataSource {  
    String name() default DataSource.systemdata;  
       
    public static String systemdata = "sysDataSource";  
   
    public static String logdata = "logDataSource";  
}