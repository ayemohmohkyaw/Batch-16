package com.jdc.mkt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "collection_data_tbl")
public class CollectionData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@ElementCollection
	@Column(name="set_value")
	@CollectionTable(
			name="set_tbl",
			joinColumns= {
					@JoinColumn(name="set_id")
					}
			)
	private Set<Integer> sets;
	
	@Column(name="list_value")
	@CollectionTable(
			name="list_tbl",
			joinColumns = {
					@JoinColumn(name="list_id")
			}
			)
	
	@ElementCollection
	private List<Integer> list;
	
	@Column(name="map_value")
	@CollectionTable(
			name="map_tbl",
			joinColumns = {
					@JoinColumn(name="map_id")
			}
			)
	@ElementCollection
	@MapKeyColumn(name="key_id")
	private Map<Integer, String> map;
	
	public enum Days{
		MON,TUE,WED,THUR,FRI,SAT,SUN
	}
}
