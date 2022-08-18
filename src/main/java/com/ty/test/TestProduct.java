package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone.Product;
import com.ty.manytoone.Review;

public class TestProduct {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

//		
//		

		Review review = new Review();
		review.setUserName("MALLIKARJUNA");
		review.setDescription("sony is in good condition");
		
		Review review1 = new Review();
		review1.setUserName("SaiPrasanna");
		review1.setDescription("sony is in good condition");

		Product product = new Product();
		product.setName("SONY xperia");
		product.setBrand("SONY ");
		product.setCost(59000);
		
		Product product1 = new Product();
		product1.setName("iphone 7");
		product1.setBrand("apple");
		product1.setCost(59000);
		
		
		Product product2 = new Product();
		product2.setName("nokia");
		product2.setBrand("nokia");
		product2.setCost(59000);
		
		review.setProduct(product);
		
		review.setProduct(product1);
		
		review1.setProduct(product2);
		
		transaction.begin();
		manager.persist(review);
		manager.persist(review1);
		manager.persist(product);
		manager.persist(product1);
		manager.persist(product2);
		transaction.commit();
		
		
		
		
		

	}

}
