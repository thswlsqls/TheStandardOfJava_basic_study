class MyPoint extends Object{
	int x;
	int y;
}

//class Circle extends MyPoint{ //???? 
//	int r;
//}

class Circle extends Object{ // ???? 
	MyPoint p = new MyPoint();
	int r;
}


public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println(c.toString()); //Circle@cac736f
		System.out.println(c); //Circle@cac736f
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x=" + c.x);
//		System.out.println("c.y=" + c.y);
//		System.out.println("c.r=" + c.r);
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x=" + c.p.x);
		System.out.println("c.p.y=" + c.p.y);
		System.out.println("c.r=" + c.r);
		
	}

}
