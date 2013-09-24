/**
 * 
 */
package com.study.repository;

import java.util.List;

import com.study.model.Testkk;

/**
 * @author jianfeng
 *
 */
public interface UserRepository {
List<Testkk> findByNameCustom(String name);
}
