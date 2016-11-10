package com.student.annotationexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentHibernateAnnotationExample {

	public static void main(String[] args) {
		final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Student student = new Student();
		student.setName("Bob");
		student.setAge(26);

		session.save(student);
		session.getTransaction().commit();

		session.close();
	}
}
