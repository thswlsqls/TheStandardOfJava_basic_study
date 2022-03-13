class AAA { // BBB의 외부클래스 
	int i; 
	BBB b = new BBB(); 

	class BBB { // AAA의 내부클래스 
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); // 객체 생성 없이 외부클래스 멤버 접근 가능
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
