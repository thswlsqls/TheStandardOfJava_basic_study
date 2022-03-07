class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// 괄호{} 안의 내용을 5번 반복한다.
		for (int i = 1; i <= 20; i++) {
			num = (int) (Math.random() * 6) + 1;
//			System.out.println(num);
//			System.out.println(Math.random());
//			System.out.println(Math.random()*10);
//			System.out.println((int)(Math.random()*10));
//			System.out.println((int)(Math.random()*11));
			System.out.println((int)(Math.random()*11)-5);
		}
	}
}