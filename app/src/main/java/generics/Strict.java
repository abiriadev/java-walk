package generics;

/**
 * Strict
 */
public class Strict<T extends Parent> {

	static void main() {
		Parent[] children = {
			new Parent(),
			new Child1(),
			new Child2(),
		};

		Strict<Parent> st = new Strict<Parent>(
			children
		);
		st.iterate();
	}

	private T[] arr;

	Strict(T[] arr) {
		this.arr = arr;
	}

	void iterate() {
		for (T item : arr) {
			item.show();
		}
	}
}

class Parent {

	void show() {
		System.out.println(
			"I am parent!"
		);
	}
}

class Child1 extends Parent {

	@Override
	void show() {
		System.out.println(
			"I am child 1!"
		);
	}
}

class Child2 extends Parent {

	@Override
	void show() {
		System.out.println(
			"I am child 2!"
		);
	}
}
