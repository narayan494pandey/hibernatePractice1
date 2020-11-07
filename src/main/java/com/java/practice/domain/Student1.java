package com.java.practice.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="student1")
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String name;
	@ManyToMany(cascade= CascadeType.ALL)
	private Set<StudentCertification> studentCertification = new HashSet<StudentCertification>(0);
	
	public Set<StudentCertification> getStudentCertification() {
		return studentCertification;
	}
	public void setStudentCertification(Set<StudentCertification> studentCertification) {
		this.studentCertification = studentCertification;
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
