package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetGst {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		GST gst = entityManager.find(GST.class, 1);

		System.out.println("Gst Id Is:" + gst.getId());
		System.out.println("Gst  GstNumber Is:" + gst.getGstNumber());
		System.out.println("State Is:" + gst.getState());
		System.out.println("Country Id Is:" + gst.getCountry());
		System.out.println("**************");

		Company company = gst.getCompany();
		System.out.println("Person Id Is:" + company.getId());
		System.out.println("Person Id Is:" + company.getName());
		System.out.println("Person Id Is:" + company.getPhone());
		System.out.println("Person Id Is:" + company.getWeb());
		System.out.println("**************");
	}

}
