/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.service.HelloServiceTest;

/**
 * @author jianfeng
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestHelloService {

	@Autowired
	private HelloServiceTest helloServiceTest;
	
	/**
	 * Test method for {@link com.study.service.HelloServiceTestImpl#sayHello(java.lang.String)}.
	 */
	@Test
	public void testSayHello() {
		String ss = helloServiceTest.sayHello("first try spring");
		System.out.println(ss);
		assertTrue(true);
	}

}
