package com.jdc.mkt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name="collection_two_tbl")
public class CollectionDataTwo {
 @Id
	private int id;

 @OrderBy("lists asc")
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
	@Enumerated(EnumType.STRING)
	@CollectionTable(
			name="list_tbl",
			joinColumns = {
					@JoinColumn(name="list_id")
			}
			)
	
	@ElementCollection
	private List<Days> list;
	
	@Column(name="map_value")
	@CollectionTable(
			name="map_tbl",
			joinColumns = {
					@JoinColumn(name="map_id")
			}
			)
	@ElementCollection
	@Enumerated(EnumType.STRING)
	@MapKeyEnumerated(EnumType.STRING)
	@MapKeyColumn(name="key_id")
	private Map<Days,String > map;
	
	public enum Days{
		MON,TUE,WED,THUR,FRI,SAT,SUN
	}

}
