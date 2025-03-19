package Hw3;
import java.util.Scanner;
public class HW03 {
	public static void main(String[] args) {
		System.out.println("輸入不想要的數字");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 0;
		for(int i =1; i <= 49; i++) {
			if(i / 10 == a || i % 10 == a) {
				continue;
			}
			System.out.println(i);	
			num ++;
		}
		System.out.println();
		System.out.println("共有" + num + "個數字可選擇");
	}
}
