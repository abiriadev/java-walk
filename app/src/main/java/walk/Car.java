package walk;

public class Car {

	String kind;
	String color;
	int year;

	void run() {
		System.out.println(
			String.format(
				"%s is running",
				kind
			)
		);
	}

	void speedUp() {
		System.out.println(
			String.format(
				"%s is speeding up",
				kind
			)
		);
	}
}
