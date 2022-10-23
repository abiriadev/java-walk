package walk;

/**
 * Person
 */
public class Person {

	private String name;
	private String phone;

	Person() {}

	Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	void printPerson() {
		System.out.println(
			String.format(
				"%s's phone number is %s",
				name,
				phone
			)
		);
	}
}
