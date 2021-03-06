import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class Ex12_3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // ����. Ÿ�� ����ġ
//		FruitBox<Toy>   toyBox   = new FruitBox<Toy>();   // ����.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // ����. Grape�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	
		Box b = new Box<String>();
		b.add(new Integer(100));
		
		Box<String> bStr = null;
		
		b = (Box)bStr; // Box<String> -> Box 가능 but 경고 
		bStr = (Box<String>) b; // Box -> Box<String> 가능 but 경고 
	
		FruitBox<Fruit> box = new FruitBox<Fruit>();
		FruitBox<Apple> abox = new FruitBox<Apple>();

		FruitBox<? extends Fruit> Ifbox = (FruitBox<? extends Fruit>) new FruitBox<Apple>();
		FruitBox<? extends Fruit> abox2 = new FruitBox<Apple>();
		
		
	
	}  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);     }
	T get(int i)     { return list.get(i); }
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}