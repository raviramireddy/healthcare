package com.example.hospitalcrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.MedicineDao;
import com.example.hospitalcrm.pojo.Medicine;

@RestController
public class MedicineController {
	@Autowired
	private MedicineDao mdao;
	@RequestMapping("savemedicine")
	public void savemedicine(@RequestBody Medicine me) {
		mdao.save(me);
		
		
		
		
		
	}

}
