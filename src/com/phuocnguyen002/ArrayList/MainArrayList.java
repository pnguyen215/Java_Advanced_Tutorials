package com.phuocnguyen002.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		Person p1 = new Person(1, "A");
		Person p2 = new Person(1, "B");
		Person p3 = new Person(1, "C");
		Person p4 = new Person(1, "D");
		// Declare ArrayList
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);
		listPerson.add(p4);
		// Output ArrayList
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
		System.out.println();
		for (int i = 0; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i).toString()); // toString or getId or getName
		}
		System.out.println();
		// Remove element
		listPerson.remove(p1); // or remove(0|1|2|3|4) index
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
		System.out.println();
		listPerson.remove(new Person(1, "C"));
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
	}

}
