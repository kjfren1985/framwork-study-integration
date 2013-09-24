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
	
	/*֪ʶ�㣺
	1.�̳�CrudRepository ���巽��,Ҳ�ɼ̳�������ʵ�ַ�ҳ�����
	2.��model��Testkk����@NamedQuery �����Լ���query��������Ƶ�query��DemoRepositoty����ķ����г�ͻʱ����@NamedQueryΪ׼��
	3.��UserRepository����ӿڲ�ͨ��
	@PersistenceContext
	EntityManager em; ʵ��   �ύ����

	4.Auditing - δѧ
	**/
}
