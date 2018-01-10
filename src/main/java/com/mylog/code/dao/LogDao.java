package com.mylog.code.dao;

import org.springframework.stereotype.Repository;

import com.mylog.code.bean.Log;

import tk.mybatis.mapper.common.Mapper;
@Repository("logDao")
public interface LogDao extends Mapper<Log>{

}
