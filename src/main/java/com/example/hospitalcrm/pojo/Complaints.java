package com.example.hospitalcrm.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Complaints {
   @Id
   @GeneratedValue
   private Integer cid;
   private String cdiseases;
   private String discription;
   @ManyToMany
   @JoinTable(name="com_dic",joinColumns= {@JoinColumn(name="cid")},inverseJoinColumns= {@JoinColumn(name="diid")})
   private List<Disease> di;
   @OneToMany(mappedBy="comp",cascade=CascadeType.ALL)
   private List<Medication> med;
   public List<Medication> getMed() {
	return med;
}
public void setMed(List<Medication> med) {
	this.med = med;
}
public List<Disease> getDi() {
	return di;
}
public void setDi(List<Disease> di) {
	this.di = di;
}
@ManyToOne
   @JoinColumn(name="vcfk")
   private Visiting visit;
   
public Visiting getVisit() {
	return visit;
}
public void setVisit(Visiting visit) {
	this.visit = visit;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCdiseases() {
	return cdiseases;
}
public void setCdiseases(String cdiseases) {
	this.cdiseases = cdiseases;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
}
