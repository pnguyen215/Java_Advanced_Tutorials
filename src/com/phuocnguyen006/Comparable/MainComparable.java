package com.phuocnguyen006.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {

	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person(1, "B"));
		listPerson.add(new Person(2, "Z"));
		listPerson.add(new Person(5, "C"));
		listPerson.add(new Person(4, "Q"));
		System.out.println("Before sort list: ");
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
		System.out.println("After sort list: ");
		Collections.sort(listPerson);
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
		System.out.println("Data is Student");
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(1, "Y"));
		listStudent.add(new Student(2, "D"));
		listStudent.add(new Student(5, "B"));
		listStudent.add(new Student(4, "T"));
		System.out.println("Before sort list: ");
		for (Student student : listStudent) {
			System.out.println(student.toString());
		}
		System.out.println("After sort list: ");
		Collections.sort(listStudent);
		for (Student student : listStudent) {
			System.out.println(student.toString());
		}
	}

}
