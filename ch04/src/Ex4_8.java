class Ex4_8 {
	public static void main(String args[]) {
		for (int i = 1; i <= 3; i++) { // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println("Hello1");
		}
		for (int i = 1; i <= 10; i+=2) { // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println("Hello2");
		}
		for (int i = 1; i <= 10; i*=2) { // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println("Hello3");
		}
		int j; // ������ ������ġ���� ����� ���� ��������
		for (j = 1; j <= 10; j++) { // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println("Hello4");
		}
		// ���ǽ��� �����ϸ�, true�� ���ֵǾ� ���ѹݹ��� 
		for (; ;) { // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println("Hello5");
		}
	}
}