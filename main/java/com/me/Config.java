package com.me;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration // beans.xml is replaced haribolll
//@ComponentScan ({"com.me", "com.service"})                              // scn all classes in the packege com.me
@ComponentScan
@PropertySource("classpath:config.properties")

public class Config 
{
	//ApplicationContext context =new AnnotationConfigApplicationContext();
}
