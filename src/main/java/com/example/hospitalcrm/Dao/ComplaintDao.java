package com.example.hospitalcrm.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalcrm.pojo.Complaints;
@Repository
public interface ComplaintDao extends JpaRepository<Complaints,Integer> {

}
