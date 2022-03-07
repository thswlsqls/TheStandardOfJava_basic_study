
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int score = 100;
		//score = 200;
		
		boolean power = true;
		
		byte b = 127; // -128 ~ 127
		
		int oct = 010; // 8진수 
		int hex = 0X10; // 16진수 
		
		long l = 10_1000_000_000L;
		
		float f = 3.14f;
		double d = 3.14d;
		
		char ch = 'A';
		int i = 'A';
		
		String str = "";
		String str2 = "ABC";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(score);
		System.out.println(power);		
		System.out.println(b);		
		System.out.println(oct); // 8	
		System.out.println(hex); // 15	
		System.out.println(l);	// 1010000000000
		System.out.println(f);		
		System.out.println(d);		
		System.out.println(10);		
		System.out.println(.10); // 0.1		
		System.out.println(10f); // 10.0		
		System.out.println(1e3); // 1000.0	
		System.out.println(ch);
		System.out.println(i); // 65
		System.out.println(""+7+7); // 77
		System.out.println(7+7+""); // 14
	}

}
