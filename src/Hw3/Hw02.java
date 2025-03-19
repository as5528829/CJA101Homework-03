package Hw3;
import java.util.Scanner;
public class Hw02 {
	public static void main(String[] args) {
		int ans;
		ans = (int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		System.out.println("----請輸入數字----");
		for(int x = 0; x != ans;) {
			if(sc.hasNextInt()) {
				x=sc.nextInt();
			}
		else {System.out.println("請輸入整數");
		}
		if(x == ans) {
			System.out.println("答對");
		}
		else {System.out.println("答錯");
		}
		}
	}
}