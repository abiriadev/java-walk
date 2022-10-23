package generics;

/**
 * Data
 */
public class Data<T, V> {

	static void main() {
		Data<Integer, Boolean> d1 = new Data<Integer, Boolean>(
			123,
			false
		);
		d1.showType();

		Data<String, Number> d2 = new Data<String, Number>(
			"Abiria",
			4.56
		);
		d2.showType();
	}

	T prop1;
	V prop2;

	Data(T prop1, V prop2) {
		this.prop1 = prop1;
		this.prop2 = prop2;
	}

	T getProp1() {
		return prop1;
	}

	V getProp2() {
		return prop2;
	}

	void showType() {
		System.out.println(
			"Type of T: " +
			prop1.getClass().getName()
		);

		System.out.println(
			"Type of V: " +
			prop2.getClass().getName()
		);
	}
}
