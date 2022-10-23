package tree.child;

import tree.parent.Parent;

/**
 * Parent
 */
public class Child extends Parent {

	private int data;

	public Child(int id, int data) {
		super(id);
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void show() {
		System.out.println(
			"id: " + getId()
		);
		System.out.println(
			"data: " + data
		);
	}
}
