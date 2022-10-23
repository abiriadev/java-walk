package stl;

/**
 * Object
 */
public class Object
	extends java.lang.Object {

	int x;

	Object(int x) {
		this.x = x;
	}

	static void main() {
		Object o1 = new Object(10);
		Object o2 = new Object(10);
		Object o3 = new Object(30);

		System.out.println(o1 == o1);
		System.out.println(o1 == o2);
		System.out.println(o1 == o3);

		System.out.println(
			o1.equals(o1)
		);
		System.out.println(
			o1.equals(o2)
		);
		System.out.println(
			o1.equals(o3)
		);

		System.out.println(
			o1.toString()
		);

		System.out.println(o3);
	}

	@Override
	public boolean equals(
		java.lang.Object obj
	) {
		if (obj instanceof Object) {
			return (
				x == ((Object) obj).x
			);
		} else return false;
	}

	@Override
	public java.lang.String toString() {
		return java.lang.String.format(
			"| x: %d |",
			x
		);
	}
}
