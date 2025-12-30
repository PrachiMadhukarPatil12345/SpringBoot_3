package com.me.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportDao implements ReportDao
{

	@Override
	public void GetReport()
	{
		System.out.println("getting reort from mysql");
	}
	
	
//	public MysqlReportDao()
//	{
//		System.out.println("mysql");
//	}
	
}
