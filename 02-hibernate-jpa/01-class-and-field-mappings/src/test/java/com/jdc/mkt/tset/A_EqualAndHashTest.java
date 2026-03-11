package com.jdc.mkt.tset;

import org.junit.jupiter.api.Test;

public class A_EqualAndHashTest {
class Human{
	 String name;
	 int age;
	Human(String name,int age){
		this.name=name;
		this.age=age;
	}
	
}
@Test()
void test() {
	var h1=new Human("Andrew",20);
	var h2=new Human("Andrew",20);
	System.out.println(h1.equals(h2));
	System.out.println(h1==h2);
}
}
