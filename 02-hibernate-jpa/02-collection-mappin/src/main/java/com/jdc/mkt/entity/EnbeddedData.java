package com.jdc.mkt.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class EnbeddedData {
	
  private String value;
}
