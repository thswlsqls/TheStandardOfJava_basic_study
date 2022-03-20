import java.util.*;
import java.util.stream.*;

class Ex14_9 {
	public static void main(String[] args) {
		String[] strArr = {
			"Inheritance", "Java", "Lambda", "stream",
			"OptionalDouble", "IntStream", "count", "sum"
		};

		Stream.of(strArr)
		.parallel() // 병렬로 처리하면, 가져오는 요소의 순서가 실행할 때 마다 달라짐. 즉 출력 순서가 달라짐. 
//		.forEach(System.out::println);
		.forEachOrdered(System.out::println); // 병렬로 처리하면서 요소의 순서를 유지함 

		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		Optional<String> sWord = Stream.of(strArr).parallel()
					               .filter(s->s.charAt(0)=='s').findAny();

		System.out.println("noEmptyStr="+noEmptyStr);
		System.out.println("sWord="+ sWord.get());

		// map() : Stream<String>을 Stream<Integer>으로 변환. (s) -> s.length()
//		Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);
		
		// mapToInt() : Stream<String> IntStream으로 변환. IntStream기본 스트림.
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum   = intStream2.reduce(0, (a,b) -> a + b);

		OptionalInt max = IntStream.empty().reduce(Integer::max);
//		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println("count="+count);
		System.out.println("sum="+sum);
//		System.out.println("max="+ max.getAsInt()); // 요소가 없을 때, 오류 발생함. 
//		System.out.println("max="+ max.orElse(0));
		System.out.println("max="+ max.orElseGet(()->0));
		System.out.println("min="+ min.getAsInt());
	}
}
