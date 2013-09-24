/**
 * 
 */
package com.study.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author jianfeng
 *
 */
@Aspect
@Component
public class MyAspect {

	@Pointcut("execution(* com.study.service.HelloService1.sayHello(..))")
	public void pointCut(){
	}
	
	@Before("pointCut()")
	public void before(){
		System.out.println("pointcut before");
	}
	@After("pointCut()")
	public void after(){
		System.out.println("pointcut after");
	}
	
}
