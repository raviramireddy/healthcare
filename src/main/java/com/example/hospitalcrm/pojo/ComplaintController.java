package com.example.hospitalcrm.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.ComplaintDao;

@RestController

public class ComplaintController {
	@Autowired
	private ComplaintDao cdao;
	@RequestMapping("savecomplaint")
	public void savecomplaint(@RequestBody Complaints com) {
		List<Medication> med = com.getMed();
		for (Medication medi : med) {
			medi.setComp(com);
			
		}
		cdao.save(com);
	}
	

}
