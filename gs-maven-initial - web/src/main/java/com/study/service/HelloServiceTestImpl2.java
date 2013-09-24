/**
 * 
 */
package com.study.service;

import org.springframework.stereotype.Service;

import com.study.annotation.HelloAnnotation;

/**
 * @author jianfeng
 *
 */
@Service("helloServiceTest2")
public class HelloServiceTestImpl2 implements HelloServiceTest {

	/* (non-Javadoc)
	 * @see com.study.service.HelloServiceTest#sayHello(java.lang.String)
	 */
	@Override
	@HelloAnnotation
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		System.out.println("sayHello2(String str)");
		return "hello "+str;
	}

}
