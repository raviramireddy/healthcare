package com.example.hospitalcrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalcrm.Dao.AppointmentDao;
import com.example.hospitalcrm.pojo.Appointment;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentDao adao;
	@RequestMapping("saveAppointment")
   public void saveAppointment(@RequestBody Appointment app) {
		adao.save(app);
   }
}
