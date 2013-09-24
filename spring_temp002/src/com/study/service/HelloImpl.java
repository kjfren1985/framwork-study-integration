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
public class HelloImpl implements HelloInterface {

	/* (non-Javadoc)
	 * @see com.study.service.HelloInterface#sayHelloAgain(java.lang.String)
	 */
	@Override
	public String sayHelloAgain(String str) {
		// TODO Auto-generated method stub
		return "kk say hello:"+ str;
	}

}
