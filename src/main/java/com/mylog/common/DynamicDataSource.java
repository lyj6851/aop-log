package com.mylog.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.mylog.code.annotation.DataSourceContextHolder;






public class DynamicDataSource extends AbstractRoutingDataSource {    
    @Override    
    protected Object determineCurrentLookupKey() {    
        return DataSourceContextHolder.getDataSource();    
    }    
}  