package br.com.modelo;

public class Car {

	private String id;
	private int year;
	private String brand;
	private String color;
	private int price;
	private boolean soldState;

	public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice,
			boolean randomSoldState) {

		this.id = randomId;
		this.brand = randomBrand;
		this.year = randomYear;
		this.color = randomColor;
		this.price = randomPrice;
		this.soldState = randomSoldState;
	}

	public Car() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldState() {
		return soldState;
	}

	public void setSoldState(boolean soldState) {
		this.soldState = soldState;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
