package Hw9;

public class Hw01{

	public static void main(String arg[]) {
		James j = new James();
		Mamto m = new Mamto();
		Thread t1 = new Thread(j);
		Thread t2 = new Thread(m);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("大胃王結束");
	}


}
