package com.mycompany.hibernate.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.hibernate.demo.model.Users;

@Component
public class UserDao {
	
	@Autowired
	private EntityManagerFactory emf;
	
	public List<Users> findAllUsers() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("select u from Users u").getResultList();
	}

}
