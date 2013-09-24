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
public class HelloServiceTestImpl implements HelloServiceTest {

	/**
	 * 
	 */
	public HelloServiceTestImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.study.service.HelloServiceTest#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "hello "+str;
	}

}
