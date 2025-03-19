package Hw2;
public class Hw05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 49;i++) {
			if((i / 10 == 4 || i % 10 == 4)) {
		    	continue;
		    }
		    System.out.println(i);
		    sum++;
		}
		System.out.println(sum);	       			
    }
}	
		
