package com.me;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
//	@Value("${:101}")
//	int id;
//	
//	@Value("${:prachi}")
//	String name;
//	
//	@Value("${:550000.000000}")
//	double salary;
	
	
	@Value("${emp.id}")
	String id;
	
	@Value("${emp.name}")
	String name;
	
	@Value("${emp.salary}")
	String salary;
	
	
	
	
	public void ShowEmp()
	{
		System.out.println("id  :" + id);
		System.out.println("name:   " + name);
		System.out.println("salary : " + salary);
	}
	
	public Employee(String id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee()
	{
		
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}



	
	
}
