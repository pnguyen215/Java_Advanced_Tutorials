package com.phuocnguyen006.Comparable;

public class Student implements Comparable<Student> {
	private int id;
	public String name;

	public Student() {

	}

	public Student(int id, String name) {
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
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName()); // return -this.name.compareTo(o.getName()); is decrease
	}

}
