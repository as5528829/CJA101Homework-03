package Hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	static int reader(FileInputStream fi) throws IOException{
		int count = 0;
		while(fi.read() != -1) {
			count += 1;
		}
		return count;
	}
	public static void main(String[] args) {
		File f = new File("C:\\CJA101_Workspace\\Homework-03\\src\\Hw7\\Sample.txt");
		try(FileInputStream fis = new FileInputStream(f);
			FileReader fr1 = new FileReader(f);
			FileReader fr2 = new FileReader(f);
			BufferedReader br = new BufferedReader(fr2);){
				int count = 0, count1 = 0, count2 = 0;
				String str;
				count = reader(fis);
				while(fr1.read() != -1) {
					count1 += 1;
				}
				while((str = br.readLine()) != null) {
					if(str.length() > 0) {
						count2 += 1;
					}
				}
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料 %n",count,count1,count2);
			}catch(IOException ie) {
				ie.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
		}
	}
}
