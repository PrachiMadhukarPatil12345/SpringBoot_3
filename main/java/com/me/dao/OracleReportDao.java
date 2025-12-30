package com.me.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("Oracal")
@Primary
public class OracleReportDao implements ReportDao
{

	@Override
	public void GetReport()
	{
		System.out.println("getting reort from Oracle");
	}
	
	
//	public OracleReportDao()
//	{
//		System.out.println("Oracle");
//	}
	
	
}
