/**
 * 
 */
package com.study.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jianfeng
 *
 */
@Aspect
@Component /*也可不加，在applicationContext.xml的context:component-scan节点中加配置*/
public class HelloAspect {

	
	@Pointcut("execution(* com.study.service.HelloServiceTestImpl*.*(..))")
    public void pointcut() {
		System.out.println("aop cut success pointcut");
	}
	
	@Before("pointcut()")
	public void cutSayHelloBefore(){
		

		System.out.println("aop cut success before!");
	}
	
	@Before("execution(* com.study.service.HelloServiceTestImpl*.*(..))")
	public void cutSayHelloBefore2(){
		

		System.out.println("aop cut success before2!");
	}

	
	@After("pointcut()")
	public void cutSayHelloAfter(){
		

		System.out.println("aop cut success after!");
	}
	
	//my annotation 另外在要切的方法上加上自定义的注释，就是切面了
	@After("@annotation(com.study.annotation.HelloAnnotation)")
	public void cutSayHelloAfter2(){
		

		System.out.println("aop cut success after2!");
	}
	
	
	//my annotation 另外在要切的方法上加上自定义的注释，就是切面了
	@Around("@annotation(com.study.annotation.HelloAnnotation)")
	public Object cutSayHelloRound(ProceedingJoinPoint pjp){
		Object retVal = null;
		System.out.println("aop cut success Around before!");
	    try {
			retVal = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("aop cut success Around after!");
		return retVal;
		
	}
	
}
