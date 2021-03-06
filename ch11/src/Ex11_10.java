import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		// Set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		System.out.println(set); //set은 정렬 불가함, 그래서 리스트로 옮기고 정렬해야 함 
//		List list = new LinkedList(set); // LinkedList(Collection c) // set의 모든 요소를 list에 저장
//		Collections.sort(list);          // Collections.sort(List list) // list를 정렬
//		System.out.println(list); // list를 출력함 
	}
}
