package com.phuocnguyen003.LinkedList;

public class Person {
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
	public boolean equals(Object obj) {
		return (obj instanceof Person)
				? (((Person) obj).getId() == this.id && ((Person) obj).getName().equals(this.name))
				: false;
	}
}
