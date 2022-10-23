package err;

/**
 * DivZero
 */
public class DivZero {

	static void main() {
		try {
			int a = 0;
			int b = 5;

			int c = b / a;
		} catch (
			ArithmeticException err
		) {
			System.out.println(
				"you can't divide by zero"
			);
			System.out.println(
				err.getMessage()
			);

			try {
				throwSomething();
			} catch (Exception e) {
				System.out.println(
					e.getMessage()
				);
			}
		} finally {
			System.out.println("fin!");
		}
	}

	static void throwSomething()
		throws Exception {
		throw new Exception();
	}
}
