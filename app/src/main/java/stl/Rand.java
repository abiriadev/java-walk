package stl;

import java.util.Random;

/**
 * Rand
 */
public class Rand {

	static void main() {
		Random rand = new Random();

		for (
			int index = 0;
			index < 10;
			index++
		) {
			System.out.println(
				rand.nextInt() % 10
			);
		}
	}
}
