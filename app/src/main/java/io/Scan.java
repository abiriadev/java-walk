package io;

import java.util.Scanner;

/**
 * Scan
 */
public class Scan {

	static void main() {
		Scanner scin = new Scanner(
			System.in
		);

		System.out.print("Name: ");
		String name = scin.nextLine();
		// System.out.print("Age: ");
		// int age = scin.nextInt();

		// System.out.println("=========");
		// System.out.println(
		// 	"Name: " + name
		// );
		// System.out.println(
		// 	"Age: " + age
		// );
	}
}
