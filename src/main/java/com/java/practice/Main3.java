package com.java.practice;
import java.util.Date;

import org.hibernate.Session;

import com.java.practice.domain.Student;
import com.java.practice.domain.StudentAddress;
import com.java.practice.util.HibernateUtil;

public class Main3 {
	 public static void main(String[] args) {
		    StudentAddress studentAddress = new StudentAddress();
		    studentAddress.setAddress_detail("HYD,India");
	    	Student student1 = new Student();
	    	student1.setName("Narayan");
	    	student1.setStream("CSE");
	    	student1.setBirthDate(new Date(1996-8-23));
	    	student1.setStudentAddress(studentAddress);
	    	//2nd student
	    	Student student2 = new Student();
	    	student2.setName("ayan");
	    	student2.setStream("CE");
	    	student2.setBirthDate(new Date(1998-6-10));
	    	student2.setStudentAddress(studentAddress);
	    	
	    	
	    	
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        //providing two student 
	    	session.save(student1);
	    	session.save(student2);
	    	session.getTransaction().commit();
	    	session.close();	
	    }
		
}
