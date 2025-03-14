package Hw2;

public class TestNineNineWhileDoWhile {
	public static void main(String[] args) {
		int i, j;
		i = 0;
		while(i <= 8) {
			i++ ;	
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
