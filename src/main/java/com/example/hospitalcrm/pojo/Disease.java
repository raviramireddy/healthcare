package com.example.hospitalcrm.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Disease {
	@Id
	@GeneratedValue
	private Integer diId;
	private String diName;
	
	public Integer getDiId() {
		return diId;
	}
	public void setDiId(Integer diId) {
		this.diId = diId;
	}
	public String getDiName() {
		return diName;
	}
	public void setDiName(String diName) {
		this.diName = diName;
	}
	

}
