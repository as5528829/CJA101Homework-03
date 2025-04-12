package Hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hw02 {
	public static void main(String[] args) {
		Set<Train> trains = new HashSet<>();
		trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trains.add(new Train(118, "自強", "高雄", "台北", 500));
		trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trains.add(new Train(122, "自強", "台中", "花蓮", 600));
		trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
		for (Train train : trains) {
			System.out.println(train);
		}
		System.out.println("----------------------------------------");
		Iterator it = trains.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------");
		TreeSet<Train> trains2 = new TreeSet<>((a, b) -> -a.compareTo(b));
		trains2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trains2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trains2.add(new Train(118, "自強", "高雄", "台北", 500));
		trains2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trains2.add(new Train(122, "自強", "台中", "花蓮", 600));
		trains2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trains2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		for (Train train : trains2) {
			System.out.println(train);
		}
		System.out.println("----------------------------------------");
		List<Train> trains3 = new LinkedList<>();
		trains3.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trains3.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trains3.add(new Train(118, "自強", "高雄", "台北", 500));
		trains3.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trains3.add(new Train(122, "自強", "台中", "花蓮", 600));
		trains3.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trains3.add(new Train(1254, "區間", "屏東", "基隆", 700));
		for (Train train : trains3) {
			System.out.println(train);
		}

	}

}
