package com.vincentmald.comparemyfood;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vincentmald.comparemyfood.model.Food;

@SpringBootApplication
public class ComparemyfoodApplication implements CommandLineRunner {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ComparemyfoodApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM food";
         
        List<Food> foods = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Food.class));
       
       for(Food food: foods) {
    	   System.out.println(food.getName());
       }
    }

}
