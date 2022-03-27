package com.vincentmald.comparemyfood.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.vincentmald.comparemyfood.model.Food;
import com.vincentmald.comparemyfood.service.FoodServiceImpl;


@RestController
public class FoodController {
	
	
	@Autowired
	private FoodServiceImpl foodService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/food")
	public ModelAndView showFood() {
		List<Food> foods = foodService.findAll();
		System.out.println(foods.size());
		for(Food food: foods) {
	    	   System.out.println(food.getName());
	       }
	
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("FoodPage.html");
        
        //modelAndView.addObject("newFood", new Food());
        modelAndView.addObject("foods",foods);
        
        return modelAndView;
	}
	
	//DTO
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.GET, value = "/foods")
	public List<Food> returnFood() {
		List<Food> foods = foodService.findAll();
		return foods;
	}
	
	
	
//	@RequestMapping(method = RequestMethod.POST, value = "/food")
//	public ModelAndView postFood(@ModelAttribute Food newFood) {
//		
//		ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:food");
//		return modelAndView;
//	}
	

}
