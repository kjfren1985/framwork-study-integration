/**
 * 
 */
package test;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
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
	
	/*@Autowired 和 @Resource*/
	//如果有一个HelloServiceTest的实现类时候，不管是否指定名称@Autowired和@Resource都可以，@Resource也可以不指定name，指定了不能指定错。
	//如果有两个HelloServiceTest的实现类时候 ，要指定名称，一个叫helloServiceTest1 一个叫helloServiceTest2 @Autowired注入的bean名称需要和service起的名称一致，
	//(接上)@Resource可以指定name属性,当然使用@Resource也可以不指定name，把bean名称起成和service里面的一样的名字

//	@Autowired  //调用的helloServiceTest2
//	private HelloServiceTest helloServiceTest2;
	@Resource(name="helloServiceTest1")  //调用的是helloServiceTest1
	private HelloServiceTest helloServiceTest2;
	
	/**
	 * Test method for {@link com.study.service.HelloServiceTestImpl#sayHello(java.lang.String)}.
	 */
	@Test
	public void testSayHello() {
		String ss = helloServiceTest2.sayHello("first try spring");
		System.out.println("JUnit4 Output: "+ss);
		assertTrue(true);
	}

	
	/*其他知识点：
	spring自带annotation
	@Service
	@Controller
	@Repository
	@Component
	
	可以查看这几个标签都被打了哪几个标签
	
	还有一些功能可查看视频
	1.自定义annotation把标签都打上，就不用在一个类上打很多标签
	
	
	*
	*
	*
	*
	*/
	
}
