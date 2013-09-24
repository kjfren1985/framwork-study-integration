package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.service.HelloImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestHello {
	
	@Autowired
	HelloImpl hello;
	
	@Test
	public void testSayHelloAgain() {
	String ss = hello.sayHelloAgain("houhou");
	System.out.println(ss);
	assertTrue(true);
	}

}
