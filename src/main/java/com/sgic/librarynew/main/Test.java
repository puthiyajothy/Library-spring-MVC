package com.sgic.librarynew.main;


import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.librarynew.model.Classification;
import com.sgic.librarynew.service.ClassificationService;
import com.sgic.librarynew.service.ClassificationServiceimpl;

@SuppressWarnings("unused")
public class Test {
	public static  void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		ClassificationService classificationService=context.getBean("classificationService",ClassificationServiceimpl.class);
		 
		Classification classification = new Classification();
		classification.setClassificationId(1);
		classification.setClassificationName("stany");
		
		classificationService.addClassification(classification);
	}

}
