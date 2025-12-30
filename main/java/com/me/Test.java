package com.me;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.me.dao.OracleReportDao;
import com.me.service.ReportService;

public class Test 
{

	public static void main(String[] args)
	{
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
//		ReportService bean = context.getBean(ReportService.class);
//		bean.generteReort();
//		//ReportService.dao=new OracleReportDao();
//		
//		Employee emp= context.getBean(Employee.class);
//		emp.ShowEmp();
		
		User user1 = context.getBean(User.class);
		System.out.println(user1.hashCode());
		User user2 = context.getBean(User.class);
		System.out.println(user2.hashCode());
		User user3 = context.getBean(User.class);
		System.out.println(user3.hashCode());
	}

}
