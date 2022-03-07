
public class PrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15);
		System.out.printf("%o%n", 15);
		System.out.printf("%x%n", 15);
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%s%n", Integer.toBinaryString(15));
	
		float f = 123.456789f;
		double d = 123.456789;
		System.out.printf("%f%n", f);
		System.out.printf("%f%n", d);
		System.out.printf("%e%n", f);
		System.out.printf("%g%n", f);
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);

		System.out.printf("[%5d]%n", 1234567);
		
		double d2 = 1.23456789;
		System.out.printf("%14.10f%n", d2); // 소수점 포함 전체 14자리, 소수점 아래 10자
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
		
	}

}
