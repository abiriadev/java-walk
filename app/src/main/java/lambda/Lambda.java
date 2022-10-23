package lambda;

/**
 * Lambda
 */
public class Lambda {

	static void main() {
		MyValue mv1;
		mv1 = n -> n * n;
		System.out.println(
			mv1.sqrt(16)
		);

		Test t1 = (n, d) ->
			(n % d) == 0;

		Test t2 = (n, m) -> n < m;

		System.out.println(
			t1.gv(10, 5)
		);

		System.out.println(
			t2.gv(10, 5)
		);
	}
}

interface MyValue {
	int sqrt(int n);
}

interface Test {
	boolean gv(int x, int y);
}
