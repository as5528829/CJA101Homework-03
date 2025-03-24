package Hw5;
import java.util.Scanner;
public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入高");
		int height = sc.nextInt();
		System.out.println("請輸入寬");
		int width = sc.nextInt();
	starSquare(height, width);	
	}	
	public static void starSquare(int height, int width) {
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}		
}

