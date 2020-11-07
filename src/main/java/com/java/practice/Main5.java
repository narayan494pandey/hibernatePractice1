package com.java.practice;

import org.hibernate.Session;
import com.java.practice.domain.Student1;
import com.java.practice.domain.StudentCertification;
import com.java.practice.util.HibernateUtil;

public class Main5 {
	public static void main(String[] args) {
		StudentCertification studentCertification1 = new StudentCertification();
		studentCertification1.setCertification_name("Java Course");

		StudentCertification studentCertification2 = new StudentCertification();
		studentCertification2.setCertification_name("Web Course");

		Student1 student11 = new Student1();
		student11.setName("Monu");
		(student11.getStudentCertification()).add(studentCertification1);
		// 2nd student
		Student1 student12 = new Student1();
		student12.setName("Jhon");
		(student12.getStudentCertification()).add(studentCertification2);

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
	    student11 = (Student1) session.get(Student1.class,1);
	    System.out.println("Student1 name is " +student11.getName());
	    student12.setName("RSonu");
	    session.saveOrUpdate(student12);
		session.getTransaction().commit();
		session.close();
	}

}
