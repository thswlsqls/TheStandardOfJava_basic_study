class Ex8_7 {
	public static void main(String[] args) {
//		throw new RuntimeException();	// Exception을 고의로 발생시킨다. RuntimeException과 그 자손은 예외처리가 선택적임. 
		try { // Exception과 그 자손은 반드시 예외처리를 해줘야 함(필수)  
			throw new Exception(); // 예외를 고의로 발생시킴 
		}catch(Exception e) {
			
		}
	}
}