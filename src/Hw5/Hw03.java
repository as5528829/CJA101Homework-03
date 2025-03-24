package Hw5;

public class Hw03 {
	public static void main(String[] arg) {
		Hw03 Max = new Hw03();
		int x1[][] = {{1,6,3},{9,5,2}};
		double x2[][] = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		System.out.println(Max.maxElement(x1));
		System.out.println(Max.maxElement(x2));	
	}
	public int maxElement(int x[][]) {
		int max = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0;j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	public double maxElement(double x[][]) {
		double max = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0;j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}	
}
