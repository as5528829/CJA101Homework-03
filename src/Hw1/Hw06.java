package Hw1;

public class Hw06 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a + a);//數字加數字 所以為10
		System.out.println(a + 'a');//因為單引號是套用unicode，所以a在unicode裡面對應的數字為97，因此5=97=102
		System.out.println(a + "a");//數字加字串 所以為5+a，最後顯示就會變5a
	}

}
