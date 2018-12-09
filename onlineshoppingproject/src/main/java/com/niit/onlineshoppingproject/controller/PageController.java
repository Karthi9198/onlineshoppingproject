package com.niit.onlineshoppingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backendproject.dao.CategoryDAO;

@Controller
public class PageController{
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value = {"/", "home", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		//passing list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
		
	}
	@RequestMapping(value = "/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickHome",true);
		return mv;
	}
		
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting)
//	{
//		if(greeting ==null) {
//			greeting="Hello";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("Greetings",greeting);
//		return mv;
//		}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting)
	{
		if(greeting ==null) {
			greeting="Hello";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
		}
	
}