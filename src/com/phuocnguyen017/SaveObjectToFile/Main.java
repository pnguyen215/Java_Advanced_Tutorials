package com.phuocnguyen017.SaveObjectToFile;

import java.io.IOException;

public class Main {

	public Main() {
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		/*
		 * create new Person object
		 */
		Person person = new Person(1, "PhuocNguyen", "398 Le Van Luong", 21);
		Person person2 = new Person(1, "PhuocNguyen", "398 Le Van Luong", 22);
		/*
		 * create new method on file
		 */
		/*
		 * 1. write to file
		 */
		MethodOnFile writeFile = new MethodOnFile();
		writeFile.writeFile(person);
		writeFile.writeFile(person2);
		System.out.println("Completely!");
		/*
		 * 2. read from file
		 */
		Person person1 = writeFile.readFile("SaveObject.txt");
		System.out.println(person1.toString());

	}

}
