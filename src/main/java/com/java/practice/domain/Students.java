package com.java.practice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	@Id @GeneratedValue
	private int student_id;
	private String name;
	
	public Students() {
		super();
	}
	public int getStudent_Id() {
		return student_id;
	}
	public void setStudent_Id(int id) {
		this.student_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	

}
