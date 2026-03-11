package com.jdc.mkt.tset;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	EntityManagerFactory emf;
	EntityManager em;

	@Test
	void test() {
		emf = Persistence.createEntityManagerFactory("class-and-field-mappings");
		
		
	}
}
