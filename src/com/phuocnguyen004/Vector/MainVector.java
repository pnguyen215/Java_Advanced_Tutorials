package com.phuocnguyen004.Vector;

import java.util.List;
import java.util.Vector;

public class MainVector {

	public static void main(String[] args) {
		Person p1 = new Person(1, "A");
		Person p2 = new Person(2, "B");
		Person p3 = new Person(3, "C");
		Person p4 = new Person(1, "A");
		// Declare Vector
		List<Person> listVector = new Vector<Person>();
		listVector.add(p1);
		listVector.add(p2);
		listVector.add(p3);
		listVector.add(p4);
		// Output Vector
		System.out.println("Show 1");
		for (Person person : listVector) {
			System.out.println(person.toString());
		}
		System.out.println("Show 2");
		for (int i = 0; i < listVector.size(); i++) {
			System.out.println(listVector.get(i).toString());
		}
		System.out.println();
		// Remove element
		listVector.remove(new Person(1, "A"));
		for (Person person : listVector) {
			System.out.println(person.toString());
		}
	}

}
