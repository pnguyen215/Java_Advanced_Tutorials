package com.phuocnguyen009.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		Person per1 = new Person(3, "A");
		Person per2 = new Person(5, "H");
		Person per3 = new Person(2, "C");
		Person per4 = new Person(1, "G");

		// Declare Set
		Set<Person> listSet = new HashSet<Person>();
		listSet.add(per1);
		listSet.add(per2);
		listSet.add(per3);
		listSet.add(per4);
		// Convert to List
		List<Person> list = new ArrayList<Person>();
		for (Person person : listSet) {
			list.add(person);
		}
		System.out.println("Show list");
		for (Person person2 : list) {
			System.out.println(person2.toString());
		}
		System.out.println("After sort to list: ");
		Collections.sort(list, new MyComparator());
		for (Person person2 : list) {
			System.out.println(person2.toString());
		}
		System.out.println("------------");
		// Remove
		listSet.remove(per1);

		// Show 1: using for-each
		for (Person person : listSet) {
			System.out.println(person.toString());
		}
		System.out.println();
		// Show 2: using Iterator
		Iterator<Person> iterator = listSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.toString());
		}
	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		}
		if (o1.getId() > o2.getId()) {
			return 1;
		}
		return 0;
	}

}
