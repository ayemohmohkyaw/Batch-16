package com.jdc.mkt.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="human_tbl")
@IdClass(HumanClassPK.class)
public class Human {
	//for composite key have two method 
	/*1 embedable class
	 * @EmbeddedId
	 *  private HumanPK id;
	 */
	//2 IdClass
	private String name;
	@Id
	private String phone;
	@Id
	private String email;
}
