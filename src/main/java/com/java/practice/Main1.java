package com.java.practice;

import org.hibernate.Session;

import com.java.practice.domain.Students;
import com.java.practice.domain.StudentDetails;
import com.java.practice.util.HibernateUtil;
public class Main1 {
	public static void main(String[] args) {
    	Students students = new Students();
    	students.setName("Narayan");
    	StudentDetails studentdetails = new StudentDetails();
    	studentdetails.setStudent_mobile_no("99XXXX2334");
    	
    	//this line is important step
    	studentdetails.setStudents(students);

    	Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    	session.save(studentdetails);
    	session.getTransaction().commit();
    	session.close();
	}

}
