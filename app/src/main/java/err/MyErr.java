package err;

/**
 * MyErr
 */
public class MyErr extends Exception {

	private int x;

	static void main() {
		try {
			throw new MyErr(123);
		} catch (MyErr err) {
			System.out.println(
				"MyErr was caught!"
			);
			System.out.println(err);
		}
	}

	MyErr(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return String.format(
			"I am %dth error",
			x
		);
	}
}
