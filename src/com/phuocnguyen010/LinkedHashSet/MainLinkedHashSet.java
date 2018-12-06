package com.phuocnguyen010.LinkedHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		Person per1 = new Person(1, "D");
		Person per2 = new Person(4, "C");
		Person per3 = new Person(2, "F");

		// Declare LinkedHashSet

		Set<Person> listSet = new LinkedHashSet<Person>();
		listSet.add(per1);
		listSet.add(per2);
		listSet.add(per3);

		// Sort
		System.out.println("Sort: ");
		List<Person> list = new ArrayList<Person>(listSet); // convert from Set to List
		Collections.sort(list, new MyComparator());
		for (Person person : list) {
			System.out.println(person.toString());
		}

		// Remove
		System.out.println("After remove: ");

		listSet.remove(new Person(1, "D"));
		listSet.remove(new Person(1, "F")); // not remove, due to name is different!

		// Show 1

		for (Person person : listSet) {
			System.out.println(person.toString());
		}

		System.out.println();
		// Show 2

		Iterator<Person> iterator = listSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
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
