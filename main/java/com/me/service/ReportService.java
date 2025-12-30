package com.me.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.me.dao.ReportDao;

@Service
public class ReportService
{
	// @Autowired
	// ReportDao mysql;  // mysql,  oracle
	//  byname injection
	
//	@Autowired
//	@Qualifier("Oracal")
//	ReportDao dao;
	// byname injection
	
	//ReportDao dao;
	
//	@Autowired               // use this if u want to keep 2 costrucors 
//	public ReportService(ReportDao dao)
//	{
//		
//		this.dao = dao;
//		System.out.println("1 param Construcctor");
//	}

//	@Autowired
//	public void setDao(ReportDao dao)
//	{
//		System.out.println("Setter called");
//		this.dao=dao;
//	}
	
	
	
//	public ReportService()
//	{
//		System.out.println("0 param Construcctor");
//	}

	
	
	
	public void generteReort()
	{
		//dao.GetReport();
		//System.out.println("report generated");
	}
	
	
	
	
	
	
	
	
//	public ReportService()
//	{
//		System.out.println("Service constructor");
//	}
	
	
	
}
