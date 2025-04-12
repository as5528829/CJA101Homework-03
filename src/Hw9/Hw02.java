package Hw9;

import Hw9.Hw02_2.Mom;
import Hw9.Hw02_2.Son;
import Hw9.Hw02_2.money;

//class money{
//	private int m = 0;
//	
//	synchronized public void save (int mny) {
//		String name = Thread.currentThread().getName();
//		while( m > 3000) {
//			System.out.println(name + "看到餘額超過3000，暫停匯款");
//			try {
//				wait();
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//				System.err.println("媽媽可以結束匯款");
//				return;
//			}
//		}
//		m += mny;
//		System.out.println(name + "存了" + mny + ",帳戶共有: " + m );
//		notify();
//
//	}		
//		
//	synchronized public void withdraw (int mny) {
//		String name = Thread.currentThread().getName();
//		while (m < mny) {
//			System.out.println(name +"看到帳戶沒錢，暫停提款");
//			try {
//				wait();
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(name + "被老媽告知帳戶已經有錢!");
//		}
//		int sum = m;
//		sum -= mny;
//		System.out.println(name + "領了" + mny + ",帳戶共有" + sum);
//		m = sum;
//		if(m <= 2000) {
//			System.out.println(name + "看到餘額在2000以下，要求匯款");
//			notify();
//		}
//	}
//}
//
//class Mom implements Runnable{
//	private money my;
//	
//	public Mom (money my) {
//		this.my = my;
//	}
//	
//	public void run() {
//		for (int i = 1; i <= 10; i++)
//			my.save(2000);
//	}
//}
//
//class Son implements Runnable {
//	public static boolean isFinished = false;
//	private money my;
//	
//	public Son (money my) {
//		this.my = my;
//	}
//	
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			my.withdraw(1000);
//	}
//	isFinished = true;
//	}
//}

public class Hw02 {
	public static void main(String[] args) {
		money my = new money();
		Mom m = new Mom(my);
		Son s = new Son(my);
		Thread t1 = new Thread(m,"媽媽");
		Thread t2 = new Thread(s,"熊大");
		t1.start();
		t2.start();
		while(true){
			if(Son.isFinished && t1.isAlive()) {
				t1.interrupt();
			}
			try {
				Thread.sleep(500);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			if(Son.isFinished && !t1.isAlive())
				break;
		}
	}

}
