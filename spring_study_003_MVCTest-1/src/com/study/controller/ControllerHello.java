/**
 * 
 */
package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.service.HelloServiceTest;

/**
 * @author jianfeng
 *
 */
@Controller
@RequestMapping("/hello")
public class ControllerHello {
	
	@Autowired
	HelloServiceTest helloServiceTest2;

	@RequestMapping(method=RequestMethod.GET, value="/home")
	public String helloSpringMvc(){
		/*�ں�AOP������ ��ӡ����̨*/
		helloServiceTest2.sayHello("����");
		
		return "/WEB-INF/views/home.jsp";
	}
}
