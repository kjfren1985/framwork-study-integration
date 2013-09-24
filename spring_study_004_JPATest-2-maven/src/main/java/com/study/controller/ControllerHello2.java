/**
 * 
 */
package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.model.User;
import com.study.service.HelloServiceTest;

/**
 * @author jianfeng
 *
 */
@Controller
@RequestMapping("/hello2")
public class ControllerHello2 {
	
	@Autowired
	HelloServiceTest helloServiceTest2;
	
	/*使用viewResolver 找的是WEB-INF/views/hello/imput.jsp*/
	// http://localhost:port/{contextRoot}/hello2/input
	@RequestMapping(method=RequestMethod.GET, value="/input")
	public String helloSpringMvc6(User user){
		
		/*总结：
		1. 返回对象按路径拼接
		2. 返回字符串用 返回字符串拼接
		*/
		
		/*融合AOP在里面 打印控制台*/
		helloServiceTest2.sayHello("哈哈");
		
		return "hello2/input";
	}
	
	
	/*使用viewResolver 找的是WEB-INF/views/hello2/home7.jsp*/
	// http://localhost:8080/spring_study_003_MVCTest-4/hello/home7
	@RequestMapping(method=RequestMethod.POST, value="/home7")
	public User helloSpringMvc7(User user){
		
		return user;
	}
	
	/*知识点总结(未涉及)
	 * 1. FreeMarker与springMVC没有研究，需要更改applicationContext.xml FreeMarker前端页面为*.ftl
	 * 2. FreeMarker与velocity都为模板引擎   主要用在博客模版和生成静态页面上？
	 * 3. 其他零碎信息 如beanValidation
	 * */
	
}
