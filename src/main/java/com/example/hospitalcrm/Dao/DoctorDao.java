package com.example.hospitalcrm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor,Integer> {

}
