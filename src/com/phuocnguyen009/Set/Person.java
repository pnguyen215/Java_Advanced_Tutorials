package com.phuocnguyen009.Set;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person) ? ((Person) obj).getId() == this.id && ((Person) obj).getName().equals(this.name)
				: false;
	}

	@Override
	public int hashCode() {
		return 1;
	}

}
