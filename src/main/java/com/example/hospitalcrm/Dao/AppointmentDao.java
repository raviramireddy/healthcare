package com.example.hospitalcrm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment,Integer> {

}
