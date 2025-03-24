package Hw5;

public class Pencil extends Pen{
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	public Pencil(String brand,int price) {
		super(brand,price);
	}
	public double getPrice() {
		return price*0.8;
	}
}
