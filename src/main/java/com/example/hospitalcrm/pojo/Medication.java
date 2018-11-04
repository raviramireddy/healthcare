package com.example.hospitalcrm.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Medication {
	@Id
	@GeneratedValue
	private Integer mid;
	private String mname;
	private Date expiryDate;
	private String company;
	@ManyToOne
	@JoinColumn(name="mcfk")
	private Complaints comp;
	public Complaints getComp() {
		return comp;
	}
	public void setComp(Complaints comp) {
		this.comp = comp;
	}
	@ManyToOne
	@JoinColumn(name="mmfk")
	private  Medicine med;
	public Medicine getMed() {
		return med;
	}
	public void setMed(Medicine med) {
		this.med = med;
	}
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	} 
	

}
