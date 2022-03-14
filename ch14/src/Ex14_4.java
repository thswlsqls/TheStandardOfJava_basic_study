import java.util.*;

class Ex14_4 {
	public static void main(String[] args) 	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++)
			list.add(i);

		// list의 모든 요소를 출력 
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		// list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x-> x%2==0 || x%3==0);
		System.out.println(list);

		list.replaceAll(i->i*10); // list�� �� ��ҿ� 10�� ���Ѵ�.
		System.out.println(list);

		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");

		// map�� ��� ��Ҹ� {k,v}�� �������� ����Ѵ�.
		map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
		System.out.println();
	}
}