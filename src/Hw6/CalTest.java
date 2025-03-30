package Hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		int x;
		int y;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("請輸入x");
			x = sc.nextInt();
			System.out.println("請輸入y");
			y = sc.nextInt();
			Calculator c = new Calculator();
			System.out.println(x + "的" + y + "次方 = " + c.powerXY(x, y));
		} catch (InputMismatchException ie) {
			System.out.println("輸入格式不正確");
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}
}
