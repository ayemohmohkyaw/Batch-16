package com.jdc.mkt;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Passport {

	@Id
	@Column(length = 9)
	int id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private BloodType blood_type;

	@Temporal(TemporalType.DATE)
	private Date issue_date;

	@Temporal(TemporalType.DATE)
	private Date valid_date;

	@Column(unique = true)
	private int customer_id;

	public enum BloodType {
		A, B, AB, O
	}

}
