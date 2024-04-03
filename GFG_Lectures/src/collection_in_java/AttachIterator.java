package collection_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AttachIterator {
	public static void removeEven(ArrayList<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 == 0)
				itr.remove();
			// itr.remove(); // Error
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(25);
		list.add(40);
		list.add(55);

		list.set(1, 111);

		list.stream()
		.filter(i -> i > 30)
		.filter(i -> i != 40)
		.map(i -> i * 1.2)
		.distinct()
		.forEach(i -> System.out.println(i));
		
	}
}
