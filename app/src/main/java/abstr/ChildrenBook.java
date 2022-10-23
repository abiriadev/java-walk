package abstr;

interface Things {
	public default void printInfo() {
		System.out.println("info");
	}
}

interface Book extends Things {
	void showTitle();
}

/**
 * ChildrenBook
 */
public class ChildrenBook
	implements Book {

	private String title;

	public void showTitle() {
		System.out.println(
			"Title: " + title
		);
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
