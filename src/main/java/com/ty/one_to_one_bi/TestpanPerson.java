package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestpanPerson {
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			Person person=new Person();
			person.setName("pavan");
			person.setEmail("pava@7411");
			person.setPhone(74111465965l);
			
			Pan pan=new Pan();
			pan.setName("pavan K");
			pan.setAddress("Bangalore");
			pan.setPanNumber("pavaty09");
			
			person.setPan(pan);
			pan.setPerson(person);
			
			entityTransaction.begin();
			entityManager.persist(person);
			entityManager.persist(pan);
			entityTransaction.commit();
			
			System.out.println("Done");
		}
}
