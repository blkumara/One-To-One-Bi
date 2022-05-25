package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateVehicleCharcy {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	 Vehicle vehicle=entityManager.find(Vehicle.class, 1);
	vehicle.setName("polo Gt");
	vehicle.setCost(1100000);

	Charcy charcy =vehicle.getCharcy();
	charcy.setCharcyNumber("KA13287hd");
	charcy.setType("VW");
	
	 vehicle.setCharcy(charcy);

	entityTransaction.begin();
	entityManager.merge(vehicle);
	entityTransaction.commit();
}

}
