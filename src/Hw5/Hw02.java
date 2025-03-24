package Hw5;

public class Hw02 {
	public static void main(String[] args) {
		randAvg();
	}
	public static void randAvg() {
		System.out.println("本次亂數結果:");
		double sum = 0;
		int x[] = new int[10];
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random()*101);
			sum = sum + x[i];
		System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("平均值為"+ sum / x.length + " ");
	}
}
