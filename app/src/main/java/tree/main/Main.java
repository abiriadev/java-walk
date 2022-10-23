package tree.main;

import tree.child.Child;
import tree.parent.Parent;

/**
 * Main
 */
public class Main {

	public static void main() {
		Parent p = new Parent(10);
		Child c = new Child(60, 3247);

		p.show();
		c.show();
	}
}
