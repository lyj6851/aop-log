package com.mylog.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylog.code.bean.Log;
import com.mylog.code.dao.LogDao;
import com.mylog.code.service.LogService;



@Service("logService")
public class LogServiceImpl  implements LogService{
	

	@Autowired
	private LogDao logDao;
	
	@Override
	public int createLog(Log log) {
		//return this.logDao.insertSelective(log);
		logDao.insert(log);
		System.out.println("模拟日志入库"+log);
		return 1;
	}
	
	@Override
	public int updateLog(Log log) {
		//return this.logDao.updateByPrimaryKeySelective(log);
		logDao.updateByPrimaryKey(log);
		System.out.println("模拟日志更新"+log);
		return 1;
	}


	





}
