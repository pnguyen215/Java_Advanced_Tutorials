package com.phuocnguyen012.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {

		Person per1 = new Person(5, "A");
		Person per2 = new Person(2, "F");
		Person per3 = new Person(1, "C");
		Person per4 = new Person(3, "Q");

		// Declare Queue

		Queue<Person> listQueue = new LinkedList<Person>();
		listQueue.add(per1);
		listQueue.add(per2);
		listQueue.add(per3);
		listQueue.add(per4);

		/*
		 * while (listQueue.isEmpty() == false) { System.out.println(listQueue.peek() +
		 * " "); listQueue.poll(); }
		 */
		// Remove

		listQueue.remove(new Person(5, "A"));

		// Show 1

		for (Person person : listQueue) {
			System.out.println(person.getId() + " " + person.getName());
		}

		System.out.println();
		// Show 2

		Iterator<Person> iterator = listQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

	}

}
