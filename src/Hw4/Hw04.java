package Hw4;
import java.util.Scanner;
public class Hw04 {
	public static void main(String[] args) {
		int count = 0;
		int x[][] = {{25, 32, 8, 19, 27} , {2500, 800, 500, 1000, 1200}};
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入要借的金額");
		int m = sc.nextInt();
		System.out.println("有錢可借的員工編號:");
		for(int i = 0; i <x[1].length; i++) {
			if(m <= x[1][i]) {
				count ++;
				System.out.println(x[0][i]);
			}
		}
		System.out.println("總共" + count + "人");
	}
}
