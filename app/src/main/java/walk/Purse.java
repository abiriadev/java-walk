package walk;

/**
 * Purse
 */
public class Purse {

	private Coin[] coins;
	private String owner;

	Purse(String owner) {
		this.owner = owner;
		this.coins = new Coin[10];
	}

	Purse(String owner, Coin[] coins) {
		this(owner);
		this.coins = coins;
	}

	public String getOwner() {
		return owner;
	}

	public Coin[] getCoins() {
		return coins;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setCoins(Coin[] coins) {
		this.coins = coins;
	}
}
