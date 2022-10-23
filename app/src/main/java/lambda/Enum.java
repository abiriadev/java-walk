package lambda;

/**
 * Enum
 */
public class Enum {

	static void main() {
		Cards cd;

		Cards[] all = Cards.values();

		for (Cards card : all) {
			System.out.println(
				card +
				": " +
				card.ordinal()
			);
		}

		cd = Cards.valueOf("CLUB");

		System.out.println(cd.getVal());
		System.out.println(
			cd.compareTo(Cards.DIAMOND)
		);
	}
}

enum Cards {
	HEART(10),
	CLUB(20),
	SPADE(30),
	DIAMOND(40);

	private int val;

	Cards(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
}
