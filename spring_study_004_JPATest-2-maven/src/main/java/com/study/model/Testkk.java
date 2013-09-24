package com.study.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the testkk database table.
 * 
 */
@Entity
@Table(name="testkk")
@NamedQuery(name="Testkk.findByIdd",query="select t from Testkk t where t.id=?1")
public class Testkk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String name;

    public Testkk() {
    }

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}