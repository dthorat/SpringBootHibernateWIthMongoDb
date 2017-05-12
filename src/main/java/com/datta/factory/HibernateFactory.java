package com.datta.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateFactory {
	
	private EntityManagerFactory factory;
	
	public HibernateFactory() {
		factory = Persistence.createEntityManagerFactory("myPu");
	}
	
	public EntityManagerFactory getEntityManagerFactory() {
		return factory;
	}
 
	public void closeEntityManagerFactory() {
		factory.close();
	}
}
