package com.example.hospitalcrm.pojo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Medicine {
	@Id
	@GeneratedValue
	private Integer meid;
	private String  mename;
	private Integer mecost;
	
	public Integer getMeid() {
		return meid;
	}
	public void setMeid(Integer meid) {
		this.meid = meid;
	}
	public String getMename() {
		return mename;
	}
	public void setMename(String mename) {
		this.mename = mename;
	}
	public Integer getMecost() {
		return mecost;
	}
	public void setMecost(Integer mecost) {
		this.mecost = mecost;
	}

}
