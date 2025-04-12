package Hw8;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Hw01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add("100");
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================================");
		for(Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("================================");
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("================================");
		for(Iterator it3 = list.iterator(); it3.hasNext();) {
			if(!(it3.next() instanceof Number)) {
				it3.remove();
			}
		}
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
