package com.java.practice.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "studentdetails")
public class StudentDetails {
	@Id
	@GeneratedValue(generator = "newGenerator") // name of primary key generator
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = {@Parameter(value = "students", name = "property")})
	private int student_id;
	private String student_mobile_no;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Students students;

	public StudentDetails() {
		super();
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_mobile_no() {
		return student_mobile_no;
	}

	public void setStudent_mobile_no(String student_mobile_no) {
		this.student_mobile_no = student_mobile_no;
	}
}
