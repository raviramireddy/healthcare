package com.example.hospitalcrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.VisitingDao;
import com.example.hospitalcrm.pojo.Visiting;

@RestController
public class VisitngControler {
	 @Autowired 
	private VisitingDao vdao;
	 @RequestMapping("savevisiting")
	 public void savevisiting(@RequestBody Visiting visit) {
		 vdao.save(visit);
	 }
	 
		
	}


