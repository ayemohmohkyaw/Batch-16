package com.test.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.jdc.homework.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductList {

	Scanner sc = new Scanner(System.in);
	EntityManagerFactory emf;
	EntityManager em;
	Product product = new Product();

	@Test
	void insertProduct() {

		emf = Persistence.createEntityManagerFactory("homework");
		em = emf.createEntityManager();
		System.out.println("Enter product name :");
		String name = sc.next();
		product.setName(name);
		System.out.println("Enter product price :");
		int price = sc.nextInt();
		product.setPrice(price);
		System.out.println("Enter qty :");
		int qty = sc.nextInt();
		product.setQty(qty);
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();

	}

	@Test
	void sellProduct() {
		System.out.println("Enter prodcut  that you want to buy :");
		String name = sc.next();
		//assertEquals(name, product.getName());
		System.out.println("Enter qty that you want to buy :");
		int qty = sc.nextInt();
		if (qty <= product.getQty()) {
			int oldQty = product.getQty();
			int newQty = oldQty - qty;
			product.setQty(newQty);
			em.persist(product);
			System.out.println("Successfully , Thanks ");

		} else {
			throw new RuntimeException("Not enough to buy !");
		}
	}
}
