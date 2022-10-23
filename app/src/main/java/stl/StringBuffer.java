package stl;

/**
 * StringBuffer
 */
public class StringBuffer {

	static void main() {
		java.lang.StringBuffer sb1 = new java.lang.StringBuffer(
			"Abiria"
		);

		java.lang.StringBuffer sb2 = new java.lang.StringBuffer(
			20
		);

		sb2.append(" is ");
		sb2.append("very ");

		sb1.append(sb2);
		sb1.append("happy :)");

		System.out.println(sb1);
	}
}
