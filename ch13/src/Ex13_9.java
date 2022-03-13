import javax.swing.JOptionPane;

class Ex13_9 {
	public static void main(String[] args) throws Exception {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		System.out.println("isInterrupted():"+th1.isInterrupted()); // false
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt();  // interrupt()�� ȣ���ϸ�, interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
		
		// main 쓰레드가 interrupt되었는지 확인 
		System.out.println("interrupted():"+ Thread.interrupted()); // false
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); // �ð� ����
		}
//		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
		System.out.println("isInterrupted():"+ this.isInterrupted()); // true
		System.out.println("isInterrupted():"+ this.isInterrupted()); // true
		System.out.println("Interrupted():"+ Thread.interrupted()); // true
		
	
	} 
}