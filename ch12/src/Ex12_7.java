class Parent {
	void parentMethod() { }
}

class Child extends Parent {
	
	@Override
	void parentMethod() { } // ���� �޼����� �̸��� �߸� ������. 
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상메서드만 가능 
interface Testable {
	void test(); // 추상메서드 
//	void check(); // 추상메서드 
}

class Ex12_7 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();
	}
}