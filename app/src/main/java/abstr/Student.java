package abstr;

/**
 * Student
 */
public class Student extends Person {

	private int year;

	public Student(
		int id,
		String name,
		int year
	) {
		super(id, name);
		this.year = year;
	}

	public void show() {
		System.out.println(
			String.format(
				"id: %s",
				getId()
			)
		);
		System.out.println(
			String.format(
				"name: %s",
				getName()
			)
		);
		System.out.println(
			String.format(
				"year: %s",
				year
			)
		);
	}
}
