package com.phuocnguyen011.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {
		Set<String> listTreeSet = new TreeSet<String>();
		listTreeSet.add("a");
		listTreeSet.add("f");
		listTreeSet.add("h");
		listTreeSet.add("b");
		listTreeSet.remove("b");
		for (String str : listTreeSet) {
			System.out.println(str);
		}
		System.out.println(listTreeSet.contains("a")); // true if given element is present in TreeSet
		Set<Person> listPerson = new TreeSet<Person>();
		listPerson.add(new Person(2, "PhuocNguyen"));
		listPerson.add(new Person(1, "DavidNguyen"));
		listPerson.add(new Person(3, "pnguyen"));
		listPerson.add(new Person(5, "hphuoc"));
		System.out.println("Show list person: ");
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
		System.out.println("After remove: ");
		listPerson.remove(new Person(5, "hphuoc"));
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
	}

}
