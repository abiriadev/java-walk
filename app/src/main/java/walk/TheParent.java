package walk;

/**
 * TheParent
 */
public class TheParent {

	int a = 10;

	void show() {
		System.out.println(
			"I am parent show"
		);
	}

	public static void main() {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();

		System.out.println(
			"child1's a: " + child1.a
		);
		System.out.println(
			"child1's b: " + child1.b
		);
		System.out.println(
			"child2's a: " + child2.a
		);
		System.out.println(
			"child2's c: " + child2.c
		);

		child1.show();
		child2.show();
	}
}

class Child1 extends TheParent {

	int b = 20;

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println(
			"I am child 1"
		);
	}
}

class Child2 extends TheParent {

	int c = 30;

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println(
			"I am child 2"
		);
	}
}
