class Ex4_8 {
	public static void main(String args[]) {
		for (int i = 1; i <= 3; i++) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello1");
		}
		for (int i = 1; i <= 10; i+=2) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello2");
		}
		for (int i = 1; i <= 10; i*=2) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello3");
		}
		int j; // 범위는 선언위치부터 선언된 블럭의 끝까지임
		for (j = 1; j <= 10; j++) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello4");
		}
		// 조건식을 생략하면, true로 간주되어 무한반문이 
		for (; ;) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello5");
		}
	}
}