import java.util.ArrayList;

public class RoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d = 1.5; d<=10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d); // 짝수 결과가 나오도록 올리거나 버림 
	
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}
		System.out.println("-------------");
		System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
	
		int i = Integer.parseInt("100");
		
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10)); // 10진수 
		System.out.println("i="+Integer.parseInt("100",2)); // 2진수 
		System.out.println("i="+Integer.parseInt("FF",16)); // 2진수 
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100); // JDK1.5이전에는 에러. 
		
//		list.add(new Integer(100)); //list에는 객체만 추가 가능함
		
		Integer li = list.get(0); // list에 저장된 첫번째 객체를 꺼낸다. 
//		int li = list.get(0).intValue(); //Integer를 int로 변환해야 함, 그러나 컴파일러가 자동형변환, 언박싱 
		
	
	}
	
	

}
