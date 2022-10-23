package tree.parent;

/**
 * Parent
 */
public class Parent {

	private int id;

	public Parent(int id) {
		this.id = id;
	}

	protected int getId() {
		return id;
	}

	public void show() {
		System.out.println("id: " + id);
	}
}
