import java.util.*;

class Ex12_2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
//		list.add(new Student("�ڹٿ�", 1, 1));
//		list.add(new Student("�ڹ�¯", 1, 2));
//		list.add(new Student("ȫ�浿", 2, 1));

//		Iterator it = list.iterator();		
//		Iterator<Student> it = list.iterator();
//		while (it.hasNext()) {
//		//  Student s = (Student)it.next(); // ���׸����� ������� ������ ����ȯ �ʿ�.
//			Student s = it.next();
//			System.out.println(s.name);
//		}
		HashMap<String, Student> map = new HashMap<>();
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
		
		//	public V get(Object key) { ... }
		// public Student get(String key) { ... }
		Student s = (Student)map.get("자바왕"); 
		
		System.out.println(map);
		System.out.println(s.name);
	} // main
}

class Student {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}