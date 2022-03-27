package com.vincentmald.comparemyfood.service;

import java.util.List;

import com.vincentmald.comparemyfood.model.Food;

public interface IFoodService {
	public Food saveFood(Food food);
	public Food updateFood(Food food);
	public void deleteFood(Integer id);
	public List<Food> findAll();
}
