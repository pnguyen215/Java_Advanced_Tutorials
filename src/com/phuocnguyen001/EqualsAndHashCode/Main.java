package com.phuocnguyen001.EqualsAndHashCode;

public class Main {

	public static void main(String[] args) {
		EqualsAndHashCode eq1 = new EqualsAndHashCode(1, "A");
		EqualsAndHashCode eq2 = new EqualsAndHashCode(1, "A");
		EqualsAndHashCode eq3 = new EqualsAndHashCode(2,"B");
		System.out.println(eq1.equals(eq3));
		System.out.println(eq1.equals(eq2));
	}

}
