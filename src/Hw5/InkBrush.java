package Hw5;

public class InkBrush extends Pen{
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	public InkBrush(String brand,int price) {
		super(brand,price);
	}
	public double getPrice() {
		return price*0.9;
	}
}
