package Hw5;

abstract public class Pen {
	protected String brand;
	protected double price;
	
	public abstract void write();
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Pen() {
		
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
