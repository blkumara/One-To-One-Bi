package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestComPanyGst {
public static void main(String[] args) {
	
	

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Company company=new Company();
	company.setName("TestYantra");
	company.setPhone(9985968598l);
	company.setWeb("www.testyantra.com");
	
	
	GST gst=new GST();
	gst.setGstNumber("gst684");
	gst.setState("Karnataka");
	gst.setCountry("India");
	gst.setCompany(company);
	
	entityTransaction.begin();
	entityManager.persist(company);
	entityManager.persist(gst);
	entityTransaction.commit();
	
	System.out.println("****DONE***");
	
	
	
}
}
