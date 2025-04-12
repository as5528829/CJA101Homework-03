package Hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNum {
	public static void main(String[] args) {
		Set num = new HashSet();
		while (num.size() != 10) {
			int x = (int) (Math.random() * 1000 + 1);
			num.add(x);
		}
		try {
			FileOutputStream fos = new FileOutputStream("C:\\CJA101_Workspace\\Homework-03\\src\\Hw7\\data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);			
				Iterator it = num.iterator();
				while (it.hasNext()) {
					ps.println(it.next());
				}
				ps.close();
				bos.close();
				fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
