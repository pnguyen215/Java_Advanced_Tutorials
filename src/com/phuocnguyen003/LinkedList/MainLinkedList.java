package com.phuocnguyen003.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {

	public static void main(String[] args) {
		Person p1 = new Person(1, "A");
		Person p2 = new Person(2, "B");
		Person p3 = new Person(3, "C");
		Person p4 = new Person(1, "A");
		// Declare LinkedList
		List<Person> listLinkedList = new LinkedList<Person>();
		listLinkedList.add(p1);
		listLinkedList.add(p2);
		listLinkedList.add(p3);
		listLinkedList.add(p4);
		// Output LinkedList
		System.out.println("Show 1");
		for (Person person : listLinkedList) {
			System.out.println(person.toString());
		}
		System.out.println();
		System.out.println("Show 2");
		for (int i = 0; i < listLinkedList.size(); i++) {
			System.out.println(listLinkedList.get(i).toString());
		}
		System.out.println();
		// Remove element
		listLinkedList.remove(2); // or p2 | p3 | p4
		for (Person person : listLinkedList) {
			System.out.println(person.toString());
		}

	}

}
