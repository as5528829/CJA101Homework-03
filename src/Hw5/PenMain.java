package Hw5;

public class PenMain {
	public static void main(String[] args) {
		Pencil p = new Pencil("鉛筆", 10);
		String brand = p.getBrand();
		System.out.println("品牌名稱" + brand);
		p.write();
		double price = p.getPrice();
		System.out.println("價錢" + price);
		System.out.println("============================");
		InkBrush b = new InkBrush("毛筆", 300);
		String brand2 = b.getBrand();
		System.out.println("品牌名稱"+ brand2);
		b.write();
		double price2 = b.getPrice();
		System.out.println("價錢" + price2);		
	}
}
