class MyPoint3 {
	int x;
	int y;
//	String getLocation() {
//		return "x:" +x+", y:"+y;
//	}
	
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// ObjectŬ������ toString()�� �������̵� 
	public String toString() {
		return "x:" +x+", y:"+y;
	}
}

//class MyPoint3D extends MyPoint3{
//	int z;
//	
//	// ������ getLocation()�� �������̵� 
//	String getLocation() {
//		return "x:" +x+", y:"+y+", z:"+z;
//	}
//}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyPoint3D p = new MyPoint3D();
		MyPoint3 p = new MyPoint3(3, 5);
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());
		System.out.println(p.toString());
		System.out.println(p);
	}

}