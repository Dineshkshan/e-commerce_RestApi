package com.restapi.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.Model.Mainmodel;

public interface MainmodelDao extends JpaRepository<Mainmodel,Integer> {

	public List<Mainmodel> findByType(String type);

}
