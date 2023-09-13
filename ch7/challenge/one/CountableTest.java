package challenge.one;

interface Countable {
	void count();
}

class Bird implements Countable {
	String name;

	Bird(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}

	void fly() {
		System.out.println("2마리 " + name + "날아간다.");
	}
}

class Tree implements Countable {
	String name;

	Tree(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}

	void ripen() {
		System.out.println(name + "열매가 잘 익었다.");
	}
}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무") };

		for (Countable e : m)
			e.count();
	}
}
