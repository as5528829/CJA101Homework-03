package Hw7;

import java.io.*;

public class Hw04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File zoo = new File("C:\\data\\");
		zoo.mkdir();
		File myZoo = new File("C:\\data\\Object.ser");
		myZoo.createNewFile();
		Animals ani[] = {new Cat("meow"), new Cat("Tom"), new Dog("wan"), new Dog("bark")};
		copyObject(ani, myZoo);
		readObject(myZoo);
		
	}
	static void copyObject(Animals[] anis,File file) throws IOException, ClassNotFoundException{
		try(FileOutputStream fr = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fr);){
			for(Animals ani:anis) {
				oos.writeObject(ani);
			}
		}
	}
	static void readObject(File file) throws IOException, ClassNotFoundException{
		try(FileInputStream fis = new FileInputStream(file);){
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(true) {
				((Animals)ois.readObject()).speak();
				System.out.println("======================");
			}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢");
		}
	}

}
