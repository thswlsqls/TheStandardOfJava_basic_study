import java.util.ArrayList;

class TvTest {}
class AudioTest {}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList list = new ArrayList();
//		ArrayList<Integer> list = new ArrayList<Integer>(); // JDK1.5 이전, 제네릭스가 도입되기 이전
		ArrayList<Object> list = new ArrayList<Object>(); // JDK1.5 이후 , 권장됨 
		list.add(10); //list.add(new Integer(10));
		list.add(20);
//		list.add("30"); // String을 추가
//		list.add(30); // 제네릭스 덕분에 차입 체크가 강화됨 
		list.add("30"); // String을 추가
		
		
//		Integer i = (Integer)list.get(2); //컴파일 OK
		String s = (String)list.get(2); //컴파일 OK
		
		// 실행 중 오류는 프로그램을 다운시킴, 따라서 실행 시 에러를 캄파일 시로 끌고 오는것이 필요함.
		// 제네릭스가 이문제를 해결
		System.out.println(list);
		
		ArrayList<TvTest> tvList = new ArrayList<TvTest> (); // Tv타입의 객체만 저장함 
		tvList.add(new TvTest());
			
//		TvTest t =  (TvTest)tvList.get(0); 	//list의 첫번째 요소를 꺼냄. 
		TvTest t =  tvList.get(0);  // list의 첫번째 요소를 꺼냄.  
	}

}
