package walk;

/**
 * Circle
 */
public class Circle {

	static final double PI = 3.141592;
	double radius;

	{
		System.out.println(
			"This will be called before constructor"
		);
	}

	static {
		System.out.println(
			"static block"
		);
	}

	Circle(double radius) {
		this.radius = radius;
		System.out.println(
			"Hello! this is constructor!"
		);
	}

	double area() {
		return radius * radius * PI;
	}

	double perimeter() {
		return 2 * PI * radius;
	}

	static double Tau() {
		return 2 * PI;
	}
}
