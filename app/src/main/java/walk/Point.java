package walk;

/**
 * Point
 */
public class Point {

	int x;
	int y;

	Point() {}

	Point(int n) {
		this(n, n);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println(
			String.format(
				"(%d, %d)",
				x,
				y
			)
		);
	}

	public static Point add(
		Point p1,
		Point p2
	) {
		return new Point(
			p1.x + p2.x,
			p1.y + p2.y
		);
	}
}
