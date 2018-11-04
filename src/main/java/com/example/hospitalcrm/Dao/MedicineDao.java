package com.example.hospitalcrm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Medicine;
@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer> {

}
