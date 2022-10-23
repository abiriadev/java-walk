package walk;

/**
 * Parent
 */
public class Parent {

	protected int x = 10;
	private int y = 20;

	Parent(int x) {
		System.out.println(
			"Parent constructor was called"
		);
		this.x = x;
	}

	void show() {
		System.out.println(
			"I am parent show"
		);
	}

	void show(String name) {
		System.out.println(
			"I am parent: " + name
		);
	}

	void print() {
		System.out.println(
			"I am parent print"
		);
	}

	public int getY() {
		return y;
	}
}
