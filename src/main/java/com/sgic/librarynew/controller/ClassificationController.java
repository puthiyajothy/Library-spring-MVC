package com.sgic.librarynew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sgic.librarynew.model.Classification;
import com.sgic.librarynew.service.ClassificationService;

@Controller
public class ClassificationController {

	@Autowired
	private ClassificationService classificationService;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String PrintWelcome(Model model) {
//		model.addAttribute("classification", new Classification());
		List<Classification> classificationList = classificationService.viewAllClassification();
		model.addAttribute("classificationList", classificationList);
		return "view";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(Model model) {
		model.addAttribute("classification", new Classification());
	
		return "addClassification";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String save(@ModelAttribute("classification") Classification classification) {
		System.out.println(classification.getClassificationName());
		classificationService.addClassification(classification);
	
		return "redirect:/";
	}
	
//	@RequestMapping(value="/list",method = RequestMethod.GET)
//		public String ListClassifiction(Model model) {
//		List<Classification> classificationList = classificationService.getAllClassification();
//		model.addAttribute("classificationList", classificationList);
////		System.out.println(model);
//			return "view";
//			
//		}
	
	
}
