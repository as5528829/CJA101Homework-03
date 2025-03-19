package Hw3;

import java.util.Scanner;

public class Hw03Advanced {
	public static void main(String[] args) {
		System.out.println("輸入不想要的數字");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 == a || i % 10 == a) {
				continue;
			}
			System.out.print(i + " ");
			num++;
			if(num % 6 == 0) {
				System.out.println();	
			}			
		}
		System.out.println("總共" + num + "個");
		System.out.println("亂數印出6個數字");
		int data[] = new int[6];
			for(int b = 0; b < 6; b++) {
			data[b] = (int) (Math.random() * 49) + 1;
				if (data[b] % 10 == a || data[b] / 10 == a) {
					b--;
					continue;
				} 
				else{
					for (int i = 0; i < b; i++) {
						if (data[b] == data[i]) {
							b--;
	                        break;
						}		        			
					}
				}
			}
			for (int x = 0; x < 6; x++) {
			System.out.println(data[x] + " ");
			}
	}
}