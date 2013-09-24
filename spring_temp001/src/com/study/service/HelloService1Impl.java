/**
 * 
 */
package com.study.service;

import org.springframework.stereotype.Service;

/**
 * @author jianfeng
 *
 */
@Service
public class HelloService1Impl implements HelloService1 {

	/**
	 * 
	 */
	public HelloService1Impl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.study.service.HelloService1#sayHello()
	 */
	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		System.out.println("sayHello()");
		return "hello"+str;
	}

}
