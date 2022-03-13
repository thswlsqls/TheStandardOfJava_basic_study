
abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}


interface Fightable {
	void move(int x, int y); // public abstract가 생략됨
	void attack(Fightable f); // public abstract가 생략
}


class Fighter extends Unit2 implements Fightable {
	
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동 ");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격 ");
	}
	
	//싸울 수 있는 상대를 불러옴
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter를 생성해 반환
		return f;
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		Unit2 u = new Fighter(); // Unit2에는 attack이 없어서 호출 불가
		Fighter f = new Fighter();
		f.move(100, 200);
		Fighter f2 = new Fighter();
		f.attack(f2);
		f.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); // Fightable에는 stop()이 없어서 호출 불가

		Fighter ff = new Fighter();
		Fightable ff2 = ff.getFightable();
	}

}
