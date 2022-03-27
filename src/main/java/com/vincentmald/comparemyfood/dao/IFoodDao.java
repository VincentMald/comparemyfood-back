package com.vincentmald.comparemyfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vincentmald.comparemyfood.model.Food;

public interface IFoodDao extends JpaRepository<Food, Integer>{

}
