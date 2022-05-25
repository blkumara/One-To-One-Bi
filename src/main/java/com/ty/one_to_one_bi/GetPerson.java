package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPerson {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		System.out.println("Person Id Is:" + person.getId());
		System.out.println("Person Name Is:" + person.getName());
		System.out.println("Person Email Is:" + person.getEmail());
		System.out.println("Person Phone Is:" + person.getPhone());
		System.out.println("**************");

		Pan pan = person.getPan();

		System.out.println("Pan Id Is:" + pan.getId());
		System.out.println("Pan Name Is:" + pan.getName());
		System.out.println("Pan Id address:" + pan.getAddress());
		System.out.println("Pan number Is:" + pan.getPanNumber());
		System.out.println("**************");

	}

}
