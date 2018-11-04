package com.example.hospitalcrm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Disease;
@Repository
public interface DiseaseDao extends JpaRepository<Disease,Integer> {

}
