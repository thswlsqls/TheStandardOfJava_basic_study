class AAA { // BBB�� �ܺ�Ŭ���� 
	int i; 
	BBB b = new BBB(); 

	class BBB { // AAA�� ����Ŭ���� 
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); // ��ü ���� ���� �ܺ�Ŭ���� ��� ���� ����
		}
	}

}



class CCC {
//	BBB b = new BBB();
}


public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BBB b = new BBB();
//		b.method();
		
		
	}

}
