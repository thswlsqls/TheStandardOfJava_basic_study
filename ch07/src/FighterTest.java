
abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�.");}
}


interface Fightable {
	void move(int x, int y); // public abstract�� ������
	void attack(Fightable f); // public abstract�� ����
}


class Fighter extends Unit2 implements Fightable {
	
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵� ");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ���� ");
	}
	
	//�ο� �� �ִ� ��븦 �ҷ���
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter�� ������ ��ȯ
		return f;
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		Unit2 u = new Fighter(); // Unit2���� attack�� ��� ȣ�� �Ұ�
		Fighter f = new Fighter();
		f.move(100, 200);
		Fighter f2 = new Fighter();
		f.attack(f2);
		f.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); // Fightable���� stop()�� ��� ȣ�� �Ұ�

		Fighter ff = new Fighter();
		Fightable ff2 = ff.getFightable();
	}

}
