package com.java.practice;


import java.util.Date;

import org.hibernate.Session;

import com.java.practice.domain.Student;
import com.java.practice.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
    	Student student = new Student();
    	student.setName("Narayan");
    	student.setRollNo(1);
    	student.setStream("CSE");
    	student.setBirthDate(new Date());
    	Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    	session.save(student);
    	session.getTransaction().commit();
    	session.close();	
    }
	
	
}
