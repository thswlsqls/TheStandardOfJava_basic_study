import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj -> (a, b) a > b ? a : b; // 람다식, 익명객체
//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
//
//		int value =  obj.max(3, 5); // 함수형 인터페이스 
	
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) {
//				return a > b ? a:b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다. 
//		MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식, 익명객체 
//		
//		int value = f.max(3, 5);
//		System.out.println("value=" + value);
		
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//		Function<String, Integer> f = 클래스이름::메서드이름;
//		Function<String, Integer> f = Integer::parseInt; // 메서드 참
//		Function<String, Integer> f = Integer::parseInt;; // 메서드 참
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s); // 메서드 참
//		System.out.println(f.apply("100")+200);
//		
////		 Supplier<MyClass> s = () -> new MyClass();
////		 Supplier<MyClass> s = MyClass::new;
//		 
////		 MyClass mc = s.get();
////		 System.out.println(mc);
////		 System.out.println(s.get());
//		 
//		 Function<Integer, MyClass> ff = (i) -> new MyClass(i);
////		 Function<Integer, MyClass> ff = MyClass::new;
//		 
////		 MyClass mc = s.get();
//		 MyClass mcf = ff.apply(100);
////		 System.out.println(mc);
////		 System.out.println(s.get());
//		 System.out.println(mcf);
//		 System.out.println(ff.apply(100).iv);
//		
////		 Function<Integer, int[]> f2 = (i) -> new int[i];
//		 Function<Integer, int[]> f2 = int[]::new; // 메서드 참조
//		int[] arr = f2.apply(200);
		
		
		 List<Integer> list = Arrays.asList(1,2,3,4,5);
		 Stream<Integer> intStream = list.stream(); // list Stream으로 변환
		 intStream.forEach(System.out::print); // forEach() 최종연산 
		 
		 // stream은 1회용, stream에 대해 최종연산을 수행하면 stream이 닫힌다. 
		 intStream = list.stream(); //list로부터 stream을 생성 
		 intStream.forEach(System.out::print);
		 
		 System.out.println("\n-----------------");
		 
		 String[] strArr = new String[] {"a", "b", "c", "d"};
//		 Stream<String> strStream = Stream.of(strArr);
		 Stream<String> strStream = Arrays.stream(strArr);
		 strStream.forEach(System.out::println);

		 System.out.println("\n-----------------");
		 
		 int[] intArr = {1, 2, 3, 4, 5};
		 IntStream intStream2 = Arrays.stream(intArr);
//		 intStream2.forEach(System.out::println);
//		 System.out.println("count="+intStream2.count());
//		 System.out.println("sum="+intStream2.sum());
		 System.out.println("average="+intStream2.average()); // 최종연산 

		 System.out.println("\n-----------------");
		 
		 Integer[] intArr2 = {1, 2, 3, 4, 5}; // 자동으로 형변환됨 
		 IntStream intStream3 = Arrays.stream(intArr);
		 intStream3.forEach(System.out::println);

		 System.out.println("\n-----------------");
		 
//		 IntStream intStream4 = new Random().ints(); // 무한스트림 
		 IntStream intStream4 = new Random().ints(10, 5, 10); // 무한스트림 
		 intStream4
//		 .limit(10)
		 .forEach(System.out::println);// 무한스트림 
		
		 // 이터레이터와 제너레이터로 무한스트림 만들기
		 //iterate(T seed, UnaryOperator f) 단항 연산자
		Stream<Integer> intStream5 = Stream.iterate(1, n -> n + 2);
		intStream5.limit(10).forEach(System.out::println); // 1, 3, 5, 7, 9 ...
		
		//generate(Supplier s) : 추가만 하는 것임 입력x 출력O
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream
		.limit(10)
		.forEach(System.out::print); // 1, 1, 1, 1, 1 ...
	
		System.out.println();
		
//		int[] arr = null; // 길이에 접근하려면, 널포인터 익셉션 발생함 
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
//		Optional<String> apt = null; // OK. 하지만 바람직X
		Optional<String> opt = Optional.empty(); // OK. 하지만 바람직X
		System.out.println("opt=" + opt);
//		System.out.println("opt=" + opt.get());
		
		String str = "";
		
//		try {
//			str = opt.get(); // 예외 발생 
//		}catch(Exception e) {
//			str = ""; // 예외가 발생하면 빈문자열로 초기화 
//		}
		
		str = opt.orElse("EMPTY");
//		str = opt.orElseGet(()-> new String());
		str = opt.orElseGet(String::new);
		System.out.println("str="+str);

				
	}
}

class MyClass {
	
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
	
};

//@FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함. 
//interface MyFunction2 {
////	public abstract int max(int a, int b);
////int max2(int a, int b);
//}
