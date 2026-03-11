package com.jdc.mkt.test;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestClass {
	EntityManagerFactory emf;
	EntityManager em;

	@Test
	void creatTable() {
		emf = Persistence.createEntityManagerFactory("03-product-proj");
	}
}
