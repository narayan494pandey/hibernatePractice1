package com.java.practice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentCertification")
public class StudentCertification {
	@Id
	@GeneratedValue
	private int certification_id;
	private String Certification_name;
	public int getCertification_id() {
		return certification_id;
	}
	public void setCertification_id(int certification_id) {
		this.certification_id = certification_id;
	}
	public String getCertification_name() {
		return Certification_name;
	}
	public void setCertification_name(String certification_name) {
		Certification_name = certification_name;
	}
	
	

}
