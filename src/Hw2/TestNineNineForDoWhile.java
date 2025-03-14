package Hw2;

public class TestNineNineForDoWhile {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 0;
			do{
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			while(j <= 8);
		System.out.println();
	    }
	}
}
