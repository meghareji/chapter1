package com.two95.CoreLibraries;

public class PhoneAdvanced extends Phone {
	private String model;
	private String color;
	private String price;

	public PhoneAdvanced(String model, String color, String price) {
		super(model, color, price);
		// TODO Auto-generated constructor stub
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
