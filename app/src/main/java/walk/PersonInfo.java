package walk;

/**
 * PersonInfo
 */
public class PersonInfo {

	String name;
	int age;
	double height;

	static int count;

	PersonInfo() {
		++count;
	}

	PersonInfo(
		String n,
		int a,
		double h
	) {
		name = n;
		age = a;
		height = h;

		++count;
	}

	void printAll() {
		System.out.println(
			"name: " + name
		);
		System.out.println(
			"age: " + age
		);
		System.out.println(
			"height: " + height
		);

		System.out.println(
			"count: " + count
		);
	}
}
