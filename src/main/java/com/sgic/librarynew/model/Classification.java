package com.sgic.librarynew.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="classification")
public class Classification {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int classificationId;
	
	@Column(name="classification_name")
	private String classificationName;
	
	public int getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
	}
	public String getClassificationName() {
		return classificationName;
	}
	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
	
	
}
