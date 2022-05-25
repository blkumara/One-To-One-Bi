package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCompany {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Company company = entityManager.find(Company.class, 1);
		System.out.println("Company Id Is:" + company.getId());
		System.out.println("Company name Is:" + company.getName());
		System.out.println("Company Phone Is:" + company.getPhone());
		System.out.println("Company Web Is:" + company.getWeb());
		System.out.println("**************");

		GST gst = company.getGst();
		System.out.println("Gst Id Is:" + gst.getId());
		System.out.println("Gst  GstNumber Is:" + gst.getGstNumber());
		System.out.println("State Is:" + gst.getState());
		System.out.println("Country Id Is:" + gst.getCountry());
		System.out.println("**************");

	}
}
