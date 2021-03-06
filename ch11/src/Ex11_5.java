import java.util.*;

class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		HashSet set = new HashSet(); // Set은 Collection의 자손 
		Collection c = new TreeSet(); // Set은 Collection의 자손 
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		} // 2번 출력되지 않고 false가 남
		
		//iterator 는 일회용이라 다쓰고 나면 다시 얻어와야 
		Iterator it2 = list.iterator(); //새로운 iterator 객체를 얻
		
		while(it2.hasNext()) {
			Object obj = it2.next();
			System.out.println(obj);
		} // 2번 출력되지 않고 false가 남
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println("for문 사용" + obj);
		}
		
//		for(int i=0; i<set.size(); i++) {
//			Object obj = set.get(i); // set은 get 메서드가 없으므로 에
//			System.out.println("for문 사용" + obj);
//		}
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		Iterator it3 = set.iterator(); //새로운 iterator 객체를 얻
		
		while(it3.hasNext()) {
			Object obj = it3.next();
			System.out.println("set"+obj);
		} // 2번 출력되지 않고 false가 남 // iterator는 표준화 되어 있으므로 오류 없
		
		
	} // main
}