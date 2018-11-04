package com.example.hospitalcrm.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Visiting {
	@Id
	@GeneratedValue
	private Integer vid;
	private Date vdate;
	@ManyToOne
	@JoinColumn(name="vdfk")
	private Doctor doc;
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	private String hospitalName;
	@OneToOne
	@JoinColumn(name="avfk")
	private Appointment appo;
	
	public Appointment getAppo() {
		return appo;
	}
	public void setAppo(Appointment appo) {
		this.appo = appo;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public Date getVdate() {
		return vdate;
	}
	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}

}
