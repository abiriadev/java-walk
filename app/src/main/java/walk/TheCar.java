package walk;

/**
 * TheCar
 */
public class TheCar {

	private String color;

	static void main() {
		TheCar myCar = new Sedan(
			"red",
			4
		);
		TheCar myCar2 = new Truck(
			"white",
			6
		);

		if (myCar instanceof Sedan) {
			((Sedan) myCar).showSeats();
		}

		if (myCar2 instanceof Sedan) {
			(
				(Sedan) myCar2
			).showSeats();
		}

		if (myCar instanceof Truck) {
			((Truck) myCar).showWheel();
		}

		if (myCar2 instanceof Truck) {
			(
				(Truck) myCar2
			).showWheel();
		}
	}

	TheCar() {}

	TheCar(String color) {
		this.color = color;
	}

	void drive() {
		System.out.println("driving");
	}
}

/**
 * Sedan
 */
class Sedan extends TheCar {

	private int seats;

	Sedan() {}

	Sedan(String color, int seats) {
		super(color);
		this.seats = seats;
	}

	void showSeats() {
		System.out.println(
			"Seats: " + seats
		);
	}
}

class Truck extends TheCar {

	private int wheel;

	Truck() {}

	Truck(String color, int wheel) {
		super(color);
		this.wheel = wheel;
	}

	void showWheel() {
		System.out.println(
			"wheel: " + wheel
		);
	}
}
