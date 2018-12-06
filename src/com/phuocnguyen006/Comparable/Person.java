package com.phuocnguyen006.Comparable;

public class Person implements Comparable<Person> {
	private int id;
	public String name;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}

	@Override
	public int compareTo(Person o) {
		if (this.id > o.getId()) {
			return 1; // change signal -1 -> 1
		} else if (this.id < o.getId()) {
			return -1;// change signal 1 -> -1
		}
		return 0;
	}

}
