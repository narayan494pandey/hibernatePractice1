package com.java.practice;
import java.util.Date;

import org.hibernate.Session;

import com.java.practice.domain.Student;
import com.java.practice.domain.StudentAddress;
import com.java.practice.util.HibernateUtil;

public class Main4 {
	 public static void main(String[] args) {
		    StudentAddress studentAddress = new StudentAddress();
		    studentAddress.setAddress_detail("Bangalore,India");
	    	Student student1 = new Student();
	    	student1.setName("Sonu");
	    	student1.setStream("ECE");
	    	student1.setBirthDate(new Date(2000-02-23));
	    	student1.setStudentAddress(studentAddress);
	    	//2nd student
	    	Student student2 = new Student();
	    	student2.setName("Jhon");
	    	student2.setStream("IT");
	    	student2.setBirthDate(new Date(2002-03-21));
	    	student2.setStudentAddress(studentAddress);
	    	
	    	(studentAddress.getStudents()).add(student1);
	    	(studentAddress.getStudents()).add(student2);
	    	
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        //providing two student 
	    	session.save(studentAddress);
	    	session.getTransaction().commit();
	    	session.close();	
	    }
		
}

