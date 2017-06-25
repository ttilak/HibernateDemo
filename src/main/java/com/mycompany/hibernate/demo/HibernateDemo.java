package com.mycompany.hibernate.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.hibernate.demo.dao.UserDao;
import com.mycompany.hibernate.demo.model.Users;

public class HibernateDemo {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("META-INF/hibernate-demo-context.xml");
		UserDao userDao = context.getBean(com.mycompany.hibernate.demo.dao.UserDao.class);
		List<Users> users = userDao.findAllUsers();
		System.out.println(users);
		
	}
}
