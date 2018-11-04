package com.example.hospitalcrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.DiseaseDao;
import com.example.hospitalcrm.pojo.Disease;

@RestController
public class DiseaseController {
	@Autowired
	private DiseaseDao dao;
	@RequestMapping("saveDisease")
	public void saveDisease(@RequestBody Disease di) {
		dao.save(di);
		
	}

}
