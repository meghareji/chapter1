package com.two95.CoreLibraries;

public class Phone {
	private String model;
	private String color;
	private String price;

	public void cal() {
		System.out.println("price of " + color + "color" + model + "phone is" + price);
	}

	public Phone(String model, String color, String price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
