package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@SecondaryTable(name="contact_tbl")
@Table(name="user_tbl" 
//indexes= {
//		@Index( columnList = "phone,email")
//},
//uniqueConstraints = {
//		
//		@UniqueConstraint(columnNames = {"email","phone"})
//}
)
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	//@Column(table="contact_tb")
	private String email;
	private int phone;
	@Embedded
	private UserInfo info;

}
