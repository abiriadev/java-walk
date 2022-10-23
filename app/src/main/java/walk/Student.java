package walk;

/**
 * Student
 */
public class Student {

	private static int nextNumber = 1;

	private static int getNextNumber() {
		int tmp = nextNumber;
		++nextNumber;
		return tmp;
	}

	private int number;
	private String name;
	private Score score;

	Student() {
		this.number = getNextNumber();
	}

	Student(
		int number,
		String name,
		Score score
	) {
		this();
		this.number = number;
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public Score getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	void printStudent() {
		System.out.println(
			"no: " + number
		);
		System.out.println(
			"name: " + name
		);
		System.out.println(
			"score: " + score.toString()
		);
	}

	void incScore(Score newScore) {
		score.incMath(
			newScore.getMath()
		);
		score.incEnglish(
			newScore.getEnglish()
		);
	}
}
