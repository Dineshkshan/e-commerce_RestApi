package com.restapi.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.Model.Mainmodel;

@Component
public class MainmodelDaoImpl {
	
	@Autowired
	private EntityManager entity;
	
	@Transactional
	public List<Mainmodel> findByType(String type) {
		
		Session session=entity.unwrap(Session.class);
		Query query=session.createQuery("from Mainmodel where type=?1");
		query.setParameter(1,type);
		List<Mainmodel>model=query.getResultList();
		System.out.println("the value of model is"+model);
		return model;
		
	}

}
