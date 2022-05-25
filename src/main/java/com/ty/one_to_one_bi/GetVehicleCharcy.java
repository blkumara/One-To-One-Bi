package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetVehicleCharcy {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 1);
		if(vehicle!=null)
		{
			System.out.println("Vehicle Id Is: "+vehicle.getId());
			System.out.println("Vehicle Id Is: "+vehicle.getName());
			System.out.println("Vehicle Id Is: "+vehicle.getCost());
			System.out.println("**************************");
		}
				
	
	
	
	
	}

}
