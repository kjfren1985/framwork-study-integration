/**
 * 
 */
package com.study.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.study.model.Testkk;
/**
 * @author jianfeng
 *
 */
public interface DemoRepositoty extends CrudRepository<Testkk,String> {
	
	/*ע�⣬��ΪTestkk�������Խ�name���ʿ�ֱ��дfindByName,����ݷ�����������jpa sql*/
	/*���ԣ�����������ѯ��������ﶨ��һ�������ͺã���������ʵ��*/
 List<Testkk> findByName(String name); //select * from Testkk t where t.name=?name

List<Testkk> findByIdd(String string);
 
 
 
}
