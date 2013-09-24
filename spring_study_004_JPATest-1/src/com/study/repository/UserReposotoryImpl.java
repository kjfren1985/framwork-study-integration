/**
 * 
 */
package com.study.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.study.model.Testkk;

/**
 * @author jianfeng
 *
 */
@Service
public class UserReposotoryImpl implements UserRepository {

	@PersistenceContext
	EntityManager em;
	
	/* (non-Javadoc)
	 * @see com.study.repository.UserRepository#findByNameCustom(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Testkk> findByNameCustom(String name) {
		String sql = "select t from Testkk t where t.name=?";
		Query query = em.createQuery(sql);
		query.setParameter(1, name);
		return query.getResultList();
	}

}
