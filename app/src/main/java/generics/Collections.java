package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Collections
 */
public class Collections {

	static void main() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(300);

		arr.add(1, 20);
		arr.set(0, 1);

		// for (Integer item : arr) {
		// 	System.out.println(item);
		// }
		Iterator<Integer> it = arr.iterator();
		while (it.hasNext()) {
			Integer t = it.next();
			System.out.println(t);
		}

		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(4000);

		arr.addAll(arr2);
		System.out.println(
			arr.contains(300)
		);

		System.out.println(
			arr.contains(400)
		);

		System.out.println(
			arr.containsAll(arr2)
		);

		arr2.add(50000);

		System.out.println(
			arr.containsAll(arr2)
		);

		System.out.println(arr.size());
		arr.remove(Integer.valueOf(20));
		System.out.println(arr.size());
		arr.clear();
		System.out.println(arr.size());

		LinkedList<String> lnk = new LinkedList<String>();
		lnk.add("Abiria");
		lnk.add("is");
		lnk.add("very");
		lnk.add("cute");

		for (String word : lnk) {
			System.out.println(word);
		}

		Stack<String> stack = new Stack<String>();
		stack.push("hello");
		stack.push("world");
		stack.pop();

		for (String item : stack) {
			System.out.println(item);
		}
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(100);
		q.add(200);
		q.add(300);

		printQueue(q);

		q.poll();
		printQueue(q);

		q.add(400);
		printQueue(q);

		q.poll();
		printQueue(q);

		ArrayList<String> list = new ArrayList<String>();

		list.add("Abiria");
		list.add("is");
		list.add("very");
		list.add("cute");
		list.add("and lovely");

		ListIterator<String> listIter = list.listIterator();
		while (listIter.hasNext()) {
			System.out.print(
				listIter.next() + " "
			);
		}

		System.out.println();

		while (listIter.hasPrevious()) {
			System.out.print(
				listIter.previous() +
				" "
			);
		}

		System.out.println();

		int[] A = {
			1,
			3,
			6,
			7,
			1,
			5,
			21,
			2,
			9,
			3,
			2,
		};

		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int i : A) {
			treeSet.add(i);
		}

		System.out.println(treeSet);

		TreeSet<ComparablePerson> treeSet2 = new TreeSet<>();

		treeSet2.add(
			new ComparablePerson(12)
		);
		treeSet2.add(
			new ComparablePerson(34)
		);
		treeSet2.add(
			new ComparablePerson(5)
		);

		System.out.println(treeSet2);

		TreeSet<Person> treeSet3 = new TreeSet<>(
			new PersonComparator()
		);

		treeSet3.add(new Person(45));
		treeSet3.add(new Person(23));
		treeSet3.add(new Person(67));

		System.out.println(treeSet3);

		HashSet<Cudata> hashSet = new HashSet<>();

		hashSet.add(
			new Cudata(1, "Abiria")
		);
		hashSet.add(
			new Cudata(2, "Abiria")
		);

		hashSet.add(
			new Cudata(1, "Abiria")
		);
		hashSet.add(
			new Cudata(1, "kokok")
		);
		hashSet.add(
			new Cudata(4, "World")
		);
		hashSet.add(
			new Cudata(5, "Hello")
		);

		// System.out.println(hashSet);
		for (Cudata cudata : hashSet) {
			System.out.println(cudata);
		}

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("Abiria", 0);
		hashMap.put("kokok", 0);

		Set<String> keySet = hashMap.keySet();
		System.out.println(keySet);

		for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
			String key = e.getKey();
			int value = e.getValue();

			System.out.println(
				String.format(
					"| %s => %d |",
					key,
					value
				)
			);
		}

		TreeMap<ComparablePerson, String> treeMap = new TreeMap<ComparablePerson, String>();

		treeMap.put(
			new ComparablePerson(12),
			"Abiria"
		);
		treeMap.put(
			new ComparablePerson(576),
			"kokok"
		);
		treeMap.put(
			new ComparablePerson(2),
			"asdf"
		);

		for (Map.Entry<ComparablePerson, String> e : treeMap.entrySet()) {
			System.out.println(
				String.format(
					"%s's score is %s",
					e.getValue(),
					e.getKey()
				)
			);
		}
	}

	static void printQueue(
		Queue<Integer> q
	) {
		for (Integer i : q) {
			System.out.print(
				String.format(
					"%d <- ",
					i
				)
			);
		}
		System.out.println();
	}
}

class Person {

	protected int score;

	Person() {}

	Person(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format(
			"score: %d",
			score
		);
	}
}

class ComparablePerson
	extends Person
	implements Comparable<Person> {

	ComparablePerson(int score) {
		super(score);
	}

	public int compareTo(Person other) {
		return this.score - other.score;
	}
}

class PersonComparator
	extends Person
	implements Comparator<Person> {

	@Override
	public boolean equals(
		Object other
	) {
		return (
			other instanceof Person &&
			score ==
			((Person) other).score
		);
	}

	@Override
	public int compare(
		Person p1,
		Person p2
	) {
		return p1.score - p2.score;
	}
}

class Cudata {

	private String name;
	private int id;

	Cudata(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return (
			obj instanceof Cudata &&
			((Cudata) obj).id == id &&
			((Cudata) obj).name == name
		);
	}

	@Override
	public int hashCode() {
		return name.hashCode() + id;
	}

	@Override
	public String toString() {
		return String.format(
			"| %d | %s |",
			id,
			name
		);
	}
}
