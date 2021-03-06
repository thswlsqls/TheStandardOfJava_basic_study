import java.util.function.*;
import java.util.*;

class Ex14_2 {
	public static void main(String[] args) {
		Supplier<Integer>  s = ()-> (int)(Math.random()*100)+1; // 1~100 난수를 반환하는 서플라이어 
		Consumer<Integer>  c = i -> System.out.print(i+", "); 
		Predicate<Integer> p = i -> i%2==0;  // 짝수인지 검사하는 프리딕터 
		Function<Integer, Integer> f = i -> i/10*10; // i의 1의자리를 없앤다. 
		
		List<Integer> list = new ArrayList<>();	
		makeRandomList(s, list);  // list를 랜덤값으로 채운다. 
		System.out.println(list); 
		printEvenNum(p, c, list); // 짝수를 출력 
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

	// Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다. 
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for(T i : list) {
			newList.add(f.apply(i)); // 1의 자리를 없애서 새로운 list 에 반환 
		}	

		return newList;
	}

	// Consumer<Integer> c = i -> System.out.print(i + ", ");
	// Predicate<Integer> p = i -> i%2==0; // 짝수인지 인식  
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) // 짝수인지 검사 
				c.accept(i); // i -> System.out.print(i + ", "); 화면에 i 출력 
		}	
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get()); //Supplier로부터 1부터 100까지 숫자를 받아 저장함 
		}
	}
}