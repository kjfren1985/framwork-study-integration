/**
 * 
 */
package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.study.model.Testkk;
import com.study.repository.DemoRepositoty;
import com.study.repository.UserRepository;


/**
 * @author jianfeng
 *
 */
public class DemoReposirotyTest extends TestSupport{

	@Autowired
	DemoRepositoty demoRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void testFindAll(){
		List<Testkk> kk = (List<Testkk>) demoRepository.findAll();
		
		for(Testkk k:kk){
			System.out.println(k.getName());
		}
		
	Assert.assertTrue(true);
	}
	
	
	@Test
	public void testFindByName(){
		List<Testkk> kk = (List<Testkk>) demoRepository.findByName("kk");
		
		for(Testkk k:kk){
			System.out.println(k.getId());
		}
		
	Assert.assertTrue(true);
	}
	
	@Test
	public void testFindByIdd(){
		List<Testkk> kk = (List<Testkk>) demoRepository.findByIdd("44");
		
		for(Testkk k:kk){
			System.out.println(k.getName());
		}
		
	Assert.assertTrue(true);
	}
	
	@Test
	public void testFindByNameCustom(){
		List<Testkk> kk = (List<Testkk>) userRepository.findByNameCustom("kk");
		
		for(Testkk k:kk){
			System.out.println(k.getId());
		}
		
	Assert.assertTrue(true);
	}
	
	/*知识点：
	1.继承CrudRepository 定义方法,也可继承其他的实现分页排序等
	2.在model的Testkk类中@NamedQuery 定制自己的query（如果定制的query和DemoRepositoty里面的方法有冲突时候以@NamedQuery为准）
	3.在UserRepository定义接口并通过
	@PersistenceContext
	EntityManager em; 实现   提交事务

	4.Auditing - 未学
	**/
}
