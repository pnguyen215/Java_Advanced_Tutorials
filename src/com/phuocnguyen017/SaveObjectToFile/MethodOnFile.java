package com.phuocnguyen017.SaveObjectToFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MethodOnFile {

	public MethodOnFile() {
	}

	public Person readFile(String nameFile) throws IOException, ClassNotFoundException {
		Person person;
		File file = new File(nameFile);
		if (file.exists()) { /* file is exist */
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			person = (Person) objectInputStream.readObject(); /* molding object */
			objectInputStream.close();
			return person;
		} else {
			System.out.println("Can not read this file! File is not exist!");
			return null;
		}

	}

	public void writeFile(Person person) throws IOException {

		File file = new File("SaveObject.txt");
		if (!file.exists()) {
			file.createNewFile(); // creating new file
			FileOutputStream fileOutputStream = new FileOutputStream(file, true); /* Permission to override file */
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(person);/* write object to file */
			fileOutputStream.close();
			objectOutputStream.close();
		} else {
			System.out.println("Can not write to file!");
			file.delete();
		}
	}
}
