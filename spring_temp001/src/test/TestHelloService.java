/**
 * 
 */
package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.service.HelloService1;

/**
 * @author jianfeng
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestHelloService {

	@Autowired
	HelloService1 helloService1;

	/**
	 * Test method for {@link com.study.service.HelloService1Impl#sayHello(java.lang.String)}.
	 */
	@Test
	public void testSayHello() {
		String ss = helloService1.sayHello("kkk");
		System.out.print(ss);
		assertTrue(true);
	}

}
