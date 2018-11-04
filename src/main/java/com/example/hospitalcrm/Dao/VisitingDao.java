package com.example.hospitalcrm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Visiting;
@Repository
public interface VisitingDao extends JpaRepository<Visiting,Integer>{

}
