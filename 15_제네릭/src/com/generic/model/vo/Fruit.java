package com.generic.model.vo;

import java.util.Objects;

public class Fruit {
	private String name;
	private String area;
	private int amount;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, String area, int amount, int price) {
		super();
		this.name = name;
		this.area = area;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getarea() {
		return area;
	}

	public void setarea(String area) {
		this.area = area;
	}

	public int getamount() {
		return amount;
	}

	public void setamount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", area=" + area + ", amount=" + amount + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, amount, area, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name) && amount == other.amount && Objects.equals(area, other.area)
				&& price == other.price;
	}


}
