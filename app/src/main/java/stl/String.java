package stl;

/**
 * String
 */
public class String {

	static void main() {
		java.lang.String s1 = "Abiria";
		java.lang.String s2 = "Abiria";
		java.lang.String s3 = new java.lang.String(
			"Abiria"
		);

		System.out.println(s1 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(
			s1.equals(s1)
		);
		System.out.println(
			s1.equals(s2)
		);
		System.out.println(
			s1.equals(s3)
		);
		System.out.println(
			"" +
			s1.charAt(0) +
			s2.charAt(5)
		);

		System.out.println(
			s1.concat(s2)
		);

		System.out.println(
			s1.contains("ir")
		);
		System.out.println(
			s1.contains("rir")
		);

		System.out.println(
			s1.indexOf("i")
		);

		System.out.println(
			s1.lastIndexOf("i")
		);

		System.out.println(s1.length());
		System.out.println(
			s1.compareTo("dfas")
		);

		System.out.println(
			s1.replace("i", "UwU")
		);
	}
}
