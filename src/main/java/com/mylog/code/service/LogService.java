package com.mylog.code.service;

import com.mylog.code.annotation.DataSource;
import com.mylog.code.bean.Log;



public interface LogService {
	//增删改
	/** 
     * 调用多数据源 
     */  
    @DataSource(name = DataSource.logdata)
	public int createLog(Log log);
    @DataSource(name = DataSource.logdata)
	public int updateLog(Log log);
	
	

	
}
