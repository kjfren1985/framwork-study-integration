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
	
	/*ʹ��viewResolver �ҵ���WEB-INF/views/hello/imput.jsp*/
	// http://localhost:port/{contextRoot}/hello2/input
	@RequestMapping(method=RequestMethod.GET, value="/input")
	public String helloSpringMvc6(User user){
		
		/*�ܽ᣺
		1. ���ض���·��ƴ��
		2. �����ַ����� �����ַ���ƴ��
		*/
		
		/*�ں�AOP������ ��ӡ����̨*/
		helloServiceTest2.sayHello("����");
		
		return "hello2/input";
	}
	
	
	/*ʹ��viewResolver �ҵ���WEB-INF/views/hello2/home7.jsp*/
	// http://localhost:8080/spring_study_003_MVCTest-4/hello/home7
	@RequestMapping(method=RequestMethod.POST, value="/home7")
	public User helloSpringMvc7(User user){
		
		return user;
	}
	
	/*֪ʶ���ܽ�(δ�漰)
	 * 1. FreeMarker��springMVCû���о�����Ҫ����applicationContext.xml FreeMarkerǰ��ҳ��Ϊ*.ftl
	 * 2. FreeMarker��velocity��Ϊģ������   ��Ҫ���ڲ���ģ������ɾ�̬ҳ���ϣ�
	 * 3. ����������Ϣ ��beanValidation
	 * */
	
}
