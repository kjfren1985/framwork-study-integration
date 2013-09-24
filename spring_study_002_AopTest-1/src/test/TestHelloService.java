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
	
	/*@Autowired �� @Resource*/
	//�����һ��HelloServiceTest��ʵ����ʱ�򣬲����Ƿ�ָ������@Autowired��@Resource�����ԣ�@ResourceҲ���Բ�ָ��name��ָ���˲���ָ����
	//���������HelloServiceTest��ʵ����ʱ�� ��Ҫָ�����ƣ�һ����helloServiceTest1 һ����helloServiceTest2 @Autowiredע���bean������Ҫ��service�������һ�£�
	//(����)@Resource����ָ��name����,��Ȼʹ��@ResourceҲ���Բ�ָ��name����bean������ɺ�service�����һ��������

//	@Autowired  //���õ�helloServiceTest2
//	private HelloServiceTest helloServiceTest2;
	@Resource(name="helloServiceTest1")  //���õ���helloServiceTest1
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

	
	/*����֪ʶ�㣺
	spring�Դ�annotation
	@Service
	@Controller
	@Repository
	@Component
	
	���Բ鿴�⼸����ǩ���������ļ�����ǩ
	
	����һЩ���ܿɲ鿴��Ƶ
	1.�Զ���annotation�ѱ�ǩ�����ϣ��Ͳ�����һ�����ϴ�ܶ��ǩ
	
	
	*
	*
	*
	*
	*/
	
}
