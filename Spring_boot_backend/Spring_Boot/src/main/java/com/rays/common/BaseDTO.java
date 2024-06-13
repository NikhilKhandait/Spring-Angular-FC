package com.rays.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@MappedSuperclass
public abstract class BaseDTO implements DropDownList{

	@Id
	@GenericGenerator(name = "nextPk", strategy = "increment")
	@GeneratedValue(generator ="nextPk")
	@Column(name = "ID", unique = true, nullable = false)
	
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String getKey() {
		return  id + "";
	}
}
