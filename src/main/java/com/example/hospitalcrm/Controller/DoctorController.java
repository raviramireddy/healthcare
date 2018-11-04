package com.example.hospitalcrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.DoctorDao;
import com.example.hospitalcrm.pojo.Doctor;
@RestController
public class DoctorController {
	@Autowired
	private DoctorDao ddao;
	 
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody Doctor doc) {
		ddao.save(doc);
	}

}
