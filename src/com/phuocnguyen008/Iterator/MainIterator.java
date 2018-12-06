package com.phuocnguyen008.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainIterator {

	public static void main(String[] args) {
		Person per1 = new Person(1, "A");
		Person per2 = new Person(3, "C");
		Person per3 = new Person(2, "B");
		Person per4 = new Person(5, "S");
		Person per5 = new Person(4, "E");

		// Declare ArrayList
		List<Person> list = new ArrayList<Person>();
		list.add(per1);
		list.add(per2);
		list.add(per3);
		list.add(per4);
		list.add(per5);

		// After sort list
		Collections.sort(list, new MyComparator());

		// Declare Iterator
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next().toString();
			System.out.println(string);
		}
		System.out.println();
		// Show the way second
		Iterator<Person> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Person str = iterator2.next();
			System.out.println(str.toString());
		}

		// Remove by your ideas
		System.out.println("After remove: ");
		Iterator<Person> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			Person person = iterator3.next();
			if (person.getName().equals("A")) { // person.getId() // person.getName()
				iterator3.remove(); // remove element is true condition
			}
		}
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return 0;
		}

	}

}
