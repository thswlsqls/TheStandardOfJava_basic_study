class Ex8_4 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]);
			System.out.println(0/0);
			System.out.println(4); 	// 실행되지 않는다.
		} catch (ArrayIndexOutOfBoundsException aiobe)	{
			if (aiobe instanceof ArrayIndexOutOfBoundsException) 
				System.out.println("true");	
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");
		} catch (Exception e){ // 마지막 캐치 블럭에는 모든 예외의 최고 조상을 둠 
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝
}