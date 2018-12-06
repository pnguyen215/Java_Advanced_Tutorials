package com.phuocnguyen001.EqualsAndHashCode;

public class EqualsAndHashCode {
	private int id;
	public String name;

	public EqualsAndHashCode() {

	}

	public EqualsAndHashCode(int id, String name) {
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
	public boolean equals(Object obj) {
		if (obj instanceof EqualsAndHashCode) {
			EqualsAndHashCode eq = (EqualsAndHashCode) obj;
			if (eq.getId() == this.id && eq.getName().equals(this.name))
				return true;
			else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return 1;
	}

}
