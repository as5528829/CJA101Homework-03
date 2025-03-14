package Hw2;

public class TestNineNine {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 0;
			while(j <= 9) {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
		}		
		System.out.println();
	    }
	}
}