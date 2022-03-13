class Ex13_8 {
	public static void main(String args[]) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start(); th2.start();

//		try {
//			Thread.sleep(2000);	
//		} catch(InterruptedException e) {}

		delay(2*1000);
		System.out.print("<<main ����>>");
	} // main
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis); // th1을 2초동안 
		}catch(InterruptedException e) {}
	}
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 ����>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 ����>>");
	} // run()
}