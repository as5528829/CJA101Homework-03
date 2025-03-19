package Hw3;
import java.util.Scanner;
public class Hw02Advanced {
	public static void main(String[] args) {
		int ans;
		ans = (int)(Math.random()*101);
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入數字(0~100)");
		for(int y = 0; y != ans;) {
			if(sc.hasNextInt()) {
				y = sc.nextInt();
			}
			else {System.out.println("請輸入整數");}
			if(y > ans) {
				System.out.println("猜低一點");
			}
			else if(y < ans) {
				System.out.println("猜高一點");
			}
			else if(y == ans){
				System.out.println("答對了，答案就是" + ans);
			}
		}
	}
}
