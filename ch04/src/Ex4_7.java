class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// ��ȣ{} ���� ������ 5�� �ݺ��Ѵ�.
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