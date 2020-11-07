package com.java.practice;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;

import com.java.practice.domain.UserDetail;
import com.java.practice.domain.User;
import com.java.practice.util.HibernateUtil;

public class Main2 {
	public static void main(String[] args) {
		User user = new User();
		user.setUsername("Narayan");
		user.setPassword("abcd@xyz");

		UserDetail userDetail = new UserDetail();
		userDetail.setFirstName("Michael");
		userDetail.setLastName("Smith");
		userDetail.setEmail("michael.smith@example.com");
		userDetail.setDob(LocalDate.of(1985, Month.APRIL, 1));
		user.setUserDetail(userDetail);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
}
