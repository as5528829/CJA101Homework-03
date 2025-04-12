package Hw7;

import java.io.*;

public class Hw03 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File input = new File("C:\\CJA101_Workspace\\JAVAWork\\www1.odt");
		File output = new File("C:\\CJA101_Workspace\\JAVAWork\\www2.odt");
	}
	static void copyFile(File input, File output) throws IOException{
		try(FileReader in = new FileReader(input);
			FileWriter out = new FileWriter(output);){
			int num;
			while((num = in.read()) != -1) {
				out.write(num);
			}
		}
	}
}
