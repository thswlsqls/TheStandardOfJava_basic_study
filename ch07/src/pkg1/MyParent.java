package pkg1;

public class MyParent{
	private int prv; // 같은 클래
			int dft; // 같은 패키
	protected int prt; // 같은 패키지 + 자손(다른 패키지)
	public int pub; // 접근 제한 없

	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
	
}

class MyParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러.
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
		
		

	}

}
