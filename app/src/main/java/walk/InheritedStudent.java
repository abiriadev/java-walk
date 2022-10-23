package walk;

/**
 * InheritedStudent
 */
public class InheritedStudent
	extends Person {

	private int score;

	InheritedStudent() {}

	InheritedStudent(
		String name,
		String phone,
		int score
	) {
		super(name, phone);
		this.score = score;
	}

	void printStudent() {
		super.printPerson();
		System.out.println(
			"score: " + score
		);
	}
}
