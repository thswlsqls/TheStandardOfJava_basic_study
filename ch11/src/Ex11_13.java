import java.util.*;

class Ex11_13 {
	public static void main(String[] args) {
//		Set set = new TreeSet(); // 범위검색, 정렬에 유리함, 정렬 필요없
//		Set set = new TreeSet(new TestComp()); // 범위검색, 정렬에 유리함, 정렬 필요없
		Set set = new TreeSet(); // 범위검색, 정렬에 유리함, 정렬 필요없
		Set set2 = new HashSet(); //  
		
		
//		for (int i = 0; set.size() < 6 ; i++) {
//			int num = (int)(Math.random()*45) + 1;
//			set.add(num);  // set.add(new Integer(num));
////			set.add(new Test()); // add 연산하면서 정렬 비교 기준이 없으므로 에
//		}
		
		set.add(new Test()); // set.add(new Integer(num));
		set.add(new Test()); // set.add(new Integer(num));
		set.add(new Test()); // set.add(new Integer(num));
		set.add(new Test()); // set.add(new Integer(num));

		System.out.println(set);
	}
}

//class Test { }

class Test implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}
	
}

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return -1;
	}
	
}