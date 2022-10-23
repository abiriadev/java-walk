package walk;

/**
 * Score
 */
public class Score {

	private int math;
	private int english;

	Score() {}

	Score(int math, int english) {
		this.math = math;
		this.english = english;
	}

	int getMath() {
		return math;
	}

	void setMath(int math) {
		this.math = math;
	}

	void incMath(int n) {
		this.math += n;
	}

	int getEnglish() {
		return english;
	}

	void setEnglish(int english) {
		this.english = english;
	}

	void incEnglish(int n) {
		this.english += n;
	}

	public String toString() {
		return String.format(
			"| math: %d | english: %d |",
			math,
			english
		);
	}
}
