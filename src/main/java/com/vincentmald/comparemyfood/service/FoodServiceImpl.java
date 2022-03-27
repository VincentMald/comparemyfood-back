package com.vincentmald.comparemyfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vincentmald.comparemyfood.dao.IFoodDao;
import com.vincentmald.comparemyfood.model.Food;


@Service("foodService")
public class FoodServiceImpl implements IFoodService{
	
	@Autowired
	private IFoodDao foodDao;

	@Override
	public Food saveFood(Food food) {
		return foodDao.save(food);
	}

	@Override
	public Food updateFood(Food food) {
		return foodDao.save(food);
	}

	@Override
	public void deleteFood(Integer id) {
		foodDao.deleteById(id);
	}

	@Override
	public List<Food> findAll() {
		return foodDao.findAll();
	}

}
