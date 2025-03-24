package Hw5;

public class RandomNum {
	String genAuthCode() {
		String pool = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String code =  new String("");
		for(int i = 0; i < 8; i++) {
			int num = (int)(Math.random()*pool.length());
			code += pool.charAt(num);
		}
		return code;
	}
	public static void main(String[] args) {
		System.out.println("本次產生驗證碼為:");
		RandomNum b = new RandomNum();
		System.out.println(b.genAuthCode());
	}
}
