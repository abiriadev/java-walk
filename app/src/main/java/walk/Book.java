package walk;

/**
 * Book
 */
public class Book {

	private String title;
	private int price;

	Book() {}

	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void printBook() {
		System.out.println(
			String.format(
				"| title | %s |",
				title
			)
		);
		System.out.println(
			String.format(
				"| price | $%d |",
				price
			)
		);
	}
}
