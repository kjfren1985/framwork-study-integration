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
@Component /*Ҳ�ɲ��ӣ���applicationContext.xml��context:component-scan�ڵ��м�����*/
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
	
	//my annotation ������Ҫ�еķ����ϼ����Զ����ע�ͣ�����������
	@After("@annotation(com.study.annotation.HelloAnnotation)")
	public void cutSayHelloAfter2(){
		

		System.out.println("aop cut success after2!");
	}
	
	
	//my annotation ������Ҫ�еķ����ϼ����Զ����ע�ͣ�����������
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
