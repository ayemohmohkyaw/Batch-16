package com.jdc.mkt.test;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Collection_test {
EntityManagerFactory emf;
EntityManager em;
@Test
void test() {
	emf=Persistence.createEntityManagerFactory("02-collection-mappin");
	
}
}
