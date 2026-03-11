package com.jdc.mkt.entity;

import org.hibernate.annotations.Check;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Contact {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(columnDefinition = "varchar(9) not null CHECK(LENGTH(phone) >= 6 AND LENGTH(phone) <= 9 )")
private String  phone;
@Check(constraints = "email REGEXP '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$'")
private String email;
@OneToOne
private Customer customer;
}
