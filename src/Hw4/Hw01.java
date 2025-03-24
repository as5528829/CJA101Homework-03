package Hw4;

public class Hw01 {
	public static void main(String[] args) {
		int sum = 0;
		int x[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		for(int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		int avg = sum / x.length;
			System.out.println("平均數= " + sum / x.length);
			System.out.println("===========================");
			System.out.println("大於平均值的數");
		for(int j = 0;j < x.length; j++) {
			if(x[j] > avg) {
				System.out.println(x[j]);	
			}
		}	
	}
}