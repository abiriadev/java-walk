package abstr;

/**
 * Main
 */
public class Main {

	public static void main() {
		System.out.println(Data.count);

		ChildData cd = new ChildData();

		cd.print();

		ChildrenBook cb = new ChildrenBook();
		cb.setTitle("dfaksdfja");
		// cb
		cb.showTitle();
		cb.printInfo();
	}
}
