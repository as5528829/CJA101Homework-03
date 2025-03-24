package Hw4;

public class Hw03 {
	public static void main(String[] args) {
		int aeiou = 0;
		String x[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length(); j++) {
				switch(x[i].charAt(j)) {
					case 'a' :
						aeiou += 1;
						break;
					case 'e' :
						aeiou += 1;
						break;
					case 'i' :
						aeiou += 1;
						break;
					case 'o' :
						aeiou += 1;
						break;
					case 'u' :
						aeiou += 1;
						break;
				}
			}
		}
		System.out.println("八大行星共有" + aeiou + "母音");
	}

}
