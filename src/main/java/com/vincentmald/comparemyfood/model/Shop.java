package com.vincentmald.comparemyfood.model;

import java.time.LocalDateTime;


public class Shop {

	private String name;
	private Double prince;
	private LocalDateTime date;
	private boolean saled;
	private Double priceWithSales;
	private Double weight;
	private TypesWeight typesWeight;
	
	
	public Shop(String name, Double prince, LocalDateTime date, boolean saled, Double priceWithSales, Double weight, String type) {
		super();
		this.name = name;
		this.prince = prince;
		this.date = LocalDateTime.now();
		this.saled = saled;
		this.priceWithSales = priceWithSales;
		this.weight = weight;
		this.setTypesWeight(TypesWeight.valueOf(type));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrince() {
		return prince;
	}

	public void setPrince(Double prince) {
		this.prince = prince;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public boolean isSaled() {
		return saled;
	}

	public void setSaled(boolean saled) {
		this.saled = saled;
	}

	public Double getPriceWithSales() {
		return priceWithSales;
	}

	public void setPriceWithSales(Double priceWithSales) {
		this.priceWithSales = priceWithSales;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public TypesWeight getTypesWeight() {
		return typesWeight;
	}

	public void setTypesWeight(TypesWeight TypesWeight) {
		this.typesWeight = TypesWeight;
	}
	
	
}


