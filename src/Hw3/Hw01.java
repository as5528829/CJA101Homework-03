package Hw3;
import java.util.Scanner;
public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三邊長");
		int[]a = new int[3];
		if(sc.hasNextInt()) {
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();
		}
		if(a[0] * a[1] * a[2] != 0) {
			if(a[0] == a[1] && a[1] == a[2] && a[2] == a[0]) {
				System.out.println("正三角形");
		}
			else if((a[0] == a[1]) || (a[1] == a[2]) || (a[2] ==  a[0])) {
				System.out.println("等腰三角形");
		}
			else if((Math.pow(a[0], 2)) + (Math.pow(a[1], 2)) == (Math.pow(a[2], 2)) || ((Math.pow(a[0], 2)) + (Math.pow(a[2], 2))) == (Math.pow(a[1], 2)) || (Math.pow(a[1], 2) + (Math.pow(a[2], 2)) == (Math.pow(a[0], 2)))){
				System.out.println("直角三角形");
		}
			else if(a[0] + a[1] > a[2] && a[0] + a[2] > a[1] && a[1] + a[2] > a[0]) {
				System.out.println("其他三角形");
		}
			else {System.out.println("不是三角形");
		}
		}
		else {System.out.println("不是三角形");
		}
	}
}
	

