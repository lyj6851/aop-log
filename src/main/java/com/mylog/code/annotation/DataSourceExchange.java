package com.mylog.code.annotation;
import java.lang.reflect.Method;  
  
import org.springframework.aop.AfterReturningAdvice;  
import org.springframework.aop.MethodBeforeAdvice;  
  
  
public class DataSourceExchange implements MethodBeforeAdvice,AfterReturningAdvice     
{    
    
    @Override    
    public void afterReturning(Object returnValue, Method method,    
            Object[] args, Object target) throws Throwable {    
        DataSourceContextHolder.clearDataSource();    
    }    
    
    @SuppressWarnings("static-access")
	@Override    
    public void before(Method method, Object[] args, Object target)    
            throws Throwable {    
        //这里DataSource是自定义的注解，不是java里的DataSource接口  
        if (method.isAnnotationPresent(DataSource.class))     
        {    
            DataSource datasource = method.getAnnotation(DataSource.class);  
            if(null == datasource || (null != datasource && null == datasource.name()))  
                DataSourceContextHolder.setDataSource(datasource.systemdata);  
            else {  
                System.out.println(datasource.name());  
                DataSourceContextHolder.setDataSource(datasource.name());    
            }  
        }    
//        else    
//        {    
//      //target是被织入增强处理的目标对象，通过获取getDataSourceName函数来获取target的数据源名称  
//            DataSourceContextHolder.setDataSource(  
//          target.getClass.getMethod("getDataSourceName").invoke(target).toString());    
//        }    
            
    }  
}  