class Ex8_7 {
	public static void main(String[] args) {
//		throw new RuntimeException();	// Exception�� ���Ƿ� �߻���Ų��. RuntimeException�� �� �ڼ��� ����ó���� ��������. 
		try { // Exception�� �� �ڼ��� �ݵ�� ����ó���� ����� ��(�ʼ�)  
			throw new Exception(); // ���ܸ� ���Ƿ� �߻���Ŵ 
		}catch(Exception e) {
			
		}
	}
}