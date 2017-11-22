package com.agent.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agent.biz.IAccountBiz;


public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");	
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		IAccountBiz account=(IAccountBiz)context.getBean("userBiz");
		System.out.println("输出："+account.findAll().size());
	}
}
