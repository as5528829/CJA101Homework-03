package Hw4;
import java.util.Scanner;
public class Hw05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年");
		int yyyy = sc.nextInt();
		System.out.println("請輸入月");
		int mm = sc.nextInt();
		System.out.println("請輸入日");
		int dd = sc.nextInt();
		int num = 0;
		switch(mm) {
			case 12 :
				num += 30;
			case 11 :
				num += 31;
			case 10 :
				num += 30;
			case 9	:
				num += 31;
			case 8  :
				num += 30;
			case 7  :
				num += 31;
			case 6  :
				num += 30;
			case 5  :
				num += 31;
			case 4  :
				num += 30;
			case 3  :
				if((yyyy % 4 == 0) && (yyyy % 100 != 0) || yyyy % 400 == 0) {
					num += 29;
				}
				else {
					num += 28;
				}
			case 2  :
				num += 31;
			case 1  :
				num += dd;
		}
		System.out.println("輸入日期為該年的" + num);
	}
}
