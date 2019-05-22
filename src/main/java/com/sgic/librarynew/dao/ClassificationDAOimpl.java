package com.sgic.librarynew.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.librarynew.model.Classification;

@Repository
@Transactional
public class ClassificationDAOimpl implements ClassificationDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}

	@Override
	public Classification addClassification(Classification classification) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(classification);
		System.out.println(classification.getClassificationName());
		return null;
	}

	@Override
	public List<Classification> viewAllClassification() {
		List<Classification> classificationList = new ArrayList<Classification>();
		classificationList=hibernateTemplate.loadAll(Classification.class);
		return classificationList;
	}

//	@Override
//	public void deleteClassificationById(Integer classification_id) {
//		// TODO Auto-generated method stub
//		
//	}

}
