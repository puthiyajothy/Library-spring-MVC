package com.sgic.librarynew.service;

import java.util.List;

import com.sgic.librarynew.model.Classification;

public interface ClassificationService {

	public abstract Classification addClassification(Classification classification);
	public abstract List<Classification>viewAllClassification();

}
