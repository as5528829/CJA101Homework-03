package Hw3;
import java.util.Scanner;

public class Hw03Advanced {
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
		System.out.println("亂數印出6個數字");
		int data[] = new int[6];
		for(int b = 0;b < data.length; b++) {
			data[b] = (int)(Math.random()*49)+1;
		for(int j = 0; j < b; j++) {
			if(data[b] == data[j]) {
				b--;
				break;
			}
			if(data[b] == a) {
				b--;
				break;
			}
		}
		}
		for(int x = 0; x < 6; x++) {
			System.out.println(data[x] + "");
		}
	}
}
