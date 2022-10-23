package generics;

/**
 * Wild
 */
public class Wild<T extends Number> {

	T data;

	Wild(T data) {
		this.data = data;
	}

	boolean same(Wild<?> x) {
		return (
			data.doubleValue() ==
			x.data.doubleValue()
		);
	}

	static void main() {
		Wild<Integer> i = new Wild<Integer>(
			123
		);

		Wild<Double> d = new Wild<Double>(
			123.4
		);

		Wild<Long> l = new Wild<Long>(
			123L
		);

		System.out.println(i.same(i));
		System.out.println(i.same(d));
		System.out.println(i.same(l));
	}
}
