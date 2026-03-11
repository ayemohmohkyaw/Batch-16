package com.jdc.mkt;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_tbl")
public class Custormer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 45, nullable = false)
	private String name;
	private int age;
	@Column(nullable = false)
	private Date dob;

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

}
