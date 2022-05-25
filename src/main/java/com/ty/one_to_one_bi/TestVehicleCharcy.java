package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestVehicleCharcy {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Thar");
		vehicle.setCost(1500000);

		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("KA13984ft");
		charcy.setType("Mahidra");
		
		 vehicle.setCharcy(charcy);

		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}

}