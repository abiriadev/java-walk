package stl;

/**
 * Wrapper
 */
public class Wrapper {

	static void main() {
		System.out.println(
			Integer.MAX_VALUE
		);
		System.out.println(
			Integer.MIN_VALUE
		);

		System.out.println(
			Integer.parseInt("123") *
			200
		);

		// Integer i = Integer.valueOf(
		// 	1234
		// );
		Integer i = 12345;
		System.out.println(
			i.intValue()
		);
		int y = i;

		System.out.println(y);
	}
}
