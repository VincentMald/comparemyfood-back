package com.vincentmald.comparemyfood.model;

//import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOOD")
public class Food {
	
	private Integer id;
	private String name;
	private String image;
	// private List<Shop> shops;

	public Food() {
	}

	public Food(String name, String image) {
		super();
		this.name = name;
		this.image = image;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column(name = "IMAGE")
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public List<Shop> getShops() {
//		return shops;
//	}
//
//	public void setShops(List<Shop> shops) {
//		this.shops = shops;
//	}
}
