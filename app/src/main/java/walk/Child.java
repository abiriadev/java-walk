package walk;

/**
 * Child
 */
public final class Child
	extends Parent {

	int y = 30;
	final int z = 40;

	public int getY() {
		return y;
	}

	Child(int x) {
		super(x);
	}

	void show() {
		System.out.println(
			"I am child show"
		);
	}

	void check() {
		System.out.println(
			"I am child check"
		);
	}

	void printData() {
		System.out.println(
			"Parent x: " + super.x
		);

		System.out.println(
			"Parent y: " + super.getY()
		);

		System.out.println(
			"Child y: " + getY()
		);
	}
}
