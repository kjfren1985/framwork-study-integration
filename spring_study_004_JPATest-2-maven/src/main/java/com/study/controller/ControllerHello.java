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
@RequestMapping("/hello")
public class ControllerHello {
	
	@Autowired
	HelloServiceTest helloServiceTest2;

	// http://localhost:8080/spring_study_003_MVCTest-2/hello/home
	@RequestMapping(method=RequestMethod.GET, value="/home")
	public String helloSpringMvc(){
		/*融合AOP在里面 打印控制台*/
		helloServiceTest2.sayHello("哈哈");
		
		return "/WEB-INF/views/home.jsp";
	}
	
	// http://localhost:8080/spring_study_003_MVCTest-2/hello/home2
	@RequestMapping(method=RequestMethod.GET, value="/home2")
	public ModelAndView helloSpringMvc2(Model model){
		
		/*融合AOP在里面 打印控制台*/
		helloServiceTest2.sayHello("哈哈");
		
		model.addAttribute("message","哈哈我用了spring mvc ModelAndView");
		
		return new ModelAndView("/WEB-INF/views/home.jsp");
	}
	
	// http://localhost:8080/spring_study_003_MVCTest-2/hello/home3
	@RequestMapping(method=RequestMethod.GET, value="/home3")
	public ModelAndView helloSpringMvc3(Model model){
		
		User user=new User();
		user.setUsrName("testusername");
		user.setPassWord("testpassword");
		
		//model.addAttribute("message","哈哈我用了spring mvc ModelAndView,直接传递了user对象到前台");
		//不能放入基础类型
		model.addAttribute(user);
		
		return new ModelAndView("/WEB-INF/views/home.jsp");
	}
	
	// http://localhost:8080/spring_study_003_MVCTest-2/hello/home4?usrName=test
	@RequestMapping(method=RequestMethod.GET, value="/home4")
	public ModelAndView helloSpringMvc4(String usrName, Model model){
		
		User user=new User();
		user.setUsrName(usrName);
		user.setPassWord("testpassword");
		
		//model.addAttribute("message","哈哈我用了spring mvc ModelAndView,直接传递了user对象到前台");
		//不能放入基础类型
		model.addAttribute(user);
		
		return new ModelAndView("/WEB-INF/views/home.jsp");
	}
	
	/*使用viewResolver*/
	// http://localhost:8080/spring_study_003_MVCTest-2/hello/home5?usrName=test
	@RequestMapping(method=RequestMethod.GET, value="/home5")
	public String helloSpringMvc5(String usrName, Model model){
		
		User user=new User();
		user.setUsrName(usrName);
		user.setPassWord("testpassword");
		
		//model.addAttribute("message","哈哈我用了spring mvc ModelAndView,直接传递了user对象到前台");
		//不能放入基础类型
		model.addAttribute(user);
		
		return "home";
	}
	
	/*使用viewResolver 找的是WEB-INF/views/hello/home6.jsp*/
	// http://localhost:8080/spring_study_003_MVCTest-2/hello/home6?usrName=test
	@RequestMapping(method=RequestMethod.GET, value="/home6")
	public User helloSpringMvc6(String usrName, Model model){
		
		User user=new User();
		user.setUsrName(usrName);
		user.setPassWord("testpassword");
		
		//不能放入基础类型
		model.addAttribute(user);
		
		return user;
	}
	
}
