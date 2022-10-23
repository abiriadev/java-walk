package lambda;

import java.util.ArrayList;

@FunctionalInterface
interface Callback<T, U> {
	U call(T n);
}

public class Map<T>
	extends ArrayList<T> {

	public <U> Map<U> map(
		Callback<T, U> cb
	) {
		Map<U> newArray = new Map<U>();

		for (T e : this) newArray.add(
			cb.call(e)
		);

		return newArray;
	}

	static void main() {
		Map<Integer> list = new Map<Integer>();

		for (
			int i = 0;
			i < 10;
			i++
		) list.add(i);

		Map<Double> mappedList = list.map(n ->
			n / 2.0
		);

		System.out.println(mappedList);
	}
}
