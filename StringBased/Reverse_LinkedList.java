package StringBased;

import java.util.LinkedList;

public class Reverse_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);

		LinkedList<Integer> rev = new LinkedList<>();
		l1.descendingIterator().forEachRemaining(rev::add);

		System.out.println(rev);
	}
}
