package abstr;

/**
 * Professor
 */
public class Professor extends Person {

	private String department;

	public Professor(
		int id,
		String name,
		String department
	) {
		super(id, name);
		this.department = department;
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
				"department: %s",
				department
			)
		);
	}
}
