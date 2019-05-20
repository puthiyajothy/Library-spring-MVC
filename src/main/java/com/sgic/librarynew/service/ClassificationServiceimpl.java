package com.sgic.librarynew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.librarynew.dao.ClassificationDAO;
import com.sgic.librarynew.model.Classification;

@Service
public class ClassificationServiceimpl implements ClassificationService {
	@Autowired
	private ClassificationDAO classificationDAO;

//public void setClassificationDAO(ClassificationDAO classificationDAO) {
//	this.classificationDAO = classificationDAO;
//}
	@Override
	public Classification addClassification(Classification classification) {
		this.classificationDAO.addClassification(classification);
		return null;
		
	}

}
