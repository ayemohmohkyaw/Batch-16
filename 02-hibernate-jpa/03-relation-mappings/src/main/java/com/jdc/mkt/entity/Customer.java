package com.jdc.mkt.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Customer {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 @Column(columnDefinition = "tinyint(1) not null default 1 ")
 private boolean isActive;
 @OneToOne(mappedBy = "customer")
 private Contact contact;
 @ManyToMany
 private List<Address> address;
 
}
