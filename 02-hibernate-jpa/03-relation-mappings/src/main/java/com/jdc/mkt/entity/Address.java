package com.jdc.mkt.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(columnDefinition = "varchar(45) null ")
private String state;
@Column(columnDefinition = "varchar(45) null")
private String township;
@Column(columnDefinition = "varchar(45) not null")
private String street;
@ManyToMany(mappedBy = "address")
private List<Customer> customer;
}
