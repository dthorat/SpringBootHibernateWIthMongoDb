package com.datta.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.datta.domain.Employee;
import com.datta.factory.HibernateFactory;

@Component
public class EmployeeRepository {
	
	HibernateFactory hibernateFactory = new HibernateFactory();
	
	private EntityManagerFactory entityManagerFactory= hibernateFactory.getEntityManagerFactory();
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void saveEmployee(Employee emp){

		
		entityManager.getTransaction().begin();
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
	}
	
	public List<Employee> getEmployee(){
		Query query = entityManager.createQuery("Select name From Employee");
		
		return query.getResultList();
	}

}
