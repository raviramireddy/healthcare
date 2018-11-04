package com.example.hospitalcrm.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.PatientDao;
import com.example.hospitalcrm.pojo.Patient;
@RestController
public class PatientController {
	@Autowired
	 private PatientDao dao;
	 
	@RequestMapping("savepatient")
	public void savepatient(@RequestBody Patient p) {
		dao.save(p);
	}
	
	
	
	@RequestMapping("givemedicinegetpatientname/{name}")
	public List<Object[]> givemedicinegetpatientname(@PathVariable("name") String name){
		return dao.givemedicinegetpatientname(name);
		
	}
	@RequestMapping("givendiseaegetpatientname/{dname}")
	public List<Object> givendiseaegetpatientname(@PathVariable("dname") String name){
		return dao.givendiseaegetpatientname(name);
		
	}    
	    @RequestMapping("givendoctorgetpatient/{pname}")
		public List<Object[]> givendoctorgetpatient(@PathVariable("pname") String name){
			return dao.givendoctorgetpatient(name);
		}
		
		@RequestMapping("givendatepatientname/{date}")
		public List<Object[]> givendatepatientname(@PathVariable("date")@DateTimeFormat(pattern="yyyy-mm-dd") Date da) {
			
			return dao.givendatepatientname(da);
		}
		@RequestMapping("givendategetpatientname/{pdate}")
		public List<Object[]> givendategetpatientname(@PathVariable("pdate")@DateTimeFormat(pattern="yyyy-mm-dd") Date da){
			return dao.givendategetpatientname(da);
			
		}
	}



