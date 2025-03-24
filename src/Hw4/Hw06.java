package Hw4;
import java.util.Arrays;
public class Hw06 {
	public static void main(String[] args){
		int [][]exam= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
		int count[] = new int[8];
		for(int i = 0; i < exam.length; i++) {
			int [] each_time = Arrays.copyOf(exam[i], exam[i].length);
			Arrays.sort(each_time);
			int hs = each_time[7];
		for(int j = 0; j < exam[i].length; j++) {
			if(hs == exam[i][j]) {
				count[j] = count[j] + 1;
				break;
			}
		}
	}
		for(int i = 0; i < count.length; i++) {
			System.out.println((i + 1) + "號同學有" + count[i] + "次最高分");
		}
	}
}	