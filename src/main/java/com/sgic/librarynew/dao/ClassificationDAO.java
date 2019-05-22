package com.sgic.librarynew.dao;

import java.util.List;

import com.sgic.librarynew.model.Classification;

public interface ClassificationDAO {

	public abstract  Classification addClassification(Classification classification);
	public abstract List<Classification>viewAllClassification();

}
