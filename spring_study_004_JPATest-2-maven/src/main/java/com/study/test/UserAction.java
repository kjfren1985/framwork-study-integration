package com.study.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.study.service.HelloServiceTest;

/**
 * 
 * @author zxf
 * —› æaop≤‚ ‘¿‡
 */

public class UserAction {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloServiceTest userAction = (HelloServiceTest)ctx.getBean("helloServiceTest");
		String ss = userAction.sayHello("first try spring");
		System.out.println(ss);
		ctx.destroy();
	}
}
