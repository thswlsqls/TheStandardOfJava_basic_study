class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car = (Car)fe;���� ����ȯ�� ������
//		car.water();
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� �� ����Ÿ��. ����ȯ ���� �Ұ�
		fe2.water();
		
//		FireEngine fe3 = (FireEngine)car;
//		Car car2 = (Car)fe2;
//		car2.dirive() -> null pointer���� , �� ���� �ν��Ͻ��� �߿�
		
//		Car c = new Car();
//		FireEngine fe4 = (FireEngine)c; // java.lang.ClassCastingException
//		fe4.water(); // ������ ������ , �����Ϸ��� ����  
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}