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
	
	/*注意，因为Testkk中有属性叫name，故可直接写findByName,会根据方法名字生成jpa sql*/
	/*所以，想做其他查询在这个类里定义一个方法就好，甚至不用实现*/
 List<Testkk> findByName(String name); //select * from Testkk t where t.name=?name

List<Testkk> findByIdd(String string);
 
 
 
}
