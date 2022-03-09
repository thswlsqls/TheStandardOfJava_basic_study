class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
//		car.water();
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
		fe2.water();
		
//		FireEngine fe3 = (FireEngine)car;
//		Car car2 = (Car)fe2;
//		car2.dirive() -> null pointer오류 , 즉 실제 인스턴스가 중요
		
//		Car c = new Car();
//		FireEngine fe4 = (FireEngine)c; // java.lang.ClassCastingException
//		fe4.water(); // 컴파일 오케이 , 컴파일러가 속음  
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}