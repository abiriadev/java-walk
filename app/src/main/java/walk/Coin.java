package walk;

/**
 * Coin
 */
public class Coin {

	private int value;
	private int count;

	Coin(int value) {
		this.value = value;
		this.count = 1;
	}

	Coin(int value, int count) {
		this(value);
		this.count = count;
	}

	public int getValue() {
		return value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
