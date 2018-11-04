package com.example.hospitalcrm.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {

	
	
	@Query("select p.firstName,do.name,c.cdiseases,c.discription from Medication m "
			+ "join m.comp c "
			+ "join m.med me "
			+ "join c.visit v "
			+ "join v.doc do "
			+ "join v.appo a "
			+ "join a.pat p "
			+ "join c.di d "
			+ "where me.mename = ?1")
	public List<Object[]> givemedicinegetpatientname(String name);
	
	@Query("select p.firstName from Complaints com "
			+ "join com.di d "
			+ "join com.visit v "
			+ "join v.appo ap "
			+ "join ap.pat p"
			+ " where d.diName=?1")
	public List<Object> givendiseaegetpatientname(String name);
	
	@Query("select p.firstName,v.vdate from Visiting v "
			+ "join v.doc d "
			+ "join v.appo ap "
			+ "join ap.pat p "
			+ "where d.name=?1")
	public List<Object[]> givendoctorgetpatient(String name);
   
	@Query("select p.firstName,p.lastName from Appointment app"
			+ " join app.pat p "
			+ "where app.da=?1")
	public List<Object[]> givendatepatientname(Date da);
	
	@Query("select v.vdate,p.firstName from Visiting v "
			+ "join v.appo ap "
			+ "join ap.pat p "
			+ "where ap.da=?1")
	public List<Object[]> givendategetpatientname(Date da);
}
