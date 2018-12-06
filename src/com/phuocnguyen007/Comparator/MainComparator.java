package com.phuocnguyen007.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparator {

	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person(1, "G"));
		listPerson.add(new Person(5, "H"));
		listPerson.add(new Person(2, "A"));
		listPerson.add(new Person(3, "D"));
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}
		System.out.println("After sort list");
		Collections.sort(listPerson, new MyComparator());
		for (Person person : listPerson) {
			System.out.println(person.toString());
		}

		System.out.println("Datebase of Student");
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student("PhuocNguyen", 21, "398 Le Van Luong"));
		listStudent.add(new Student("DavidNguyen", 21, "398 Le Van Luong"));
		listStudent.add(new Student("Hphuoc", 21, "398 Le Van Luong"));
		listStudent.add(new Student("nguyen phuoc", 21, "398 Le Van Luong"));
		listStudent.add(new Student("png", 21, "398 Le Van Luong"));
		listStudent.add(new Student("dto", 21, "398 Le Van Luong"));
		for (Student student : listStudent) {
			System.out.println(student.toString());
		}
		System.out.println("After sort list");
		Collections.sort(listStudent, new MyStudent());
		for (Student student : listStudent) {
			System.out.println(student.toString());
		}
	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else
			return 0;
	}

}

class MyStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.getName().compareToIgnoreCase(o2.getName()));
	}
}
