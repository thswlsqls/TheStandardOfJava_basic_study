class A {
//	public void method(B b) {
//		b.method();
//	}
	public void method(I i) { // �������̽� I�� ������ ��� ��ü�� ���� �� ���� 
		i.method();
	}
}

interface I {
	public void method();
}


class B implements I{
	public void method() {
		System.out.println("BŬ������ �޼��� ");
	}
}

class C implements I{
	public void method() {
		System.out.println("CŬ������ �޼��� ");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method(new C());

	}

}
