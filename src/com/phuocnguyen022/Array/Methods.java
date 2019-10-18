package com.phuocnguyen022.Array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Methods implements Serializable {

	private static final long serialVersionUID = 1L;

	public final String SET_NAME_FILE = "MultiplicationTwoArrays.txt";

	/*
	 * A. Single Dimensional Array
	 */
	public void init() {
		int arrays[] = new int[4];
		int arrays2[] = { 11, 67, 90, 23, 110, 92 };
		arrays[0] = 12;
		arrays[1] = 13;
		arrays[2] = 14;
		arrays[3] = 15;
		// traversing elements
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		System.out.println();
		for (int i = 0; i < arrays2.length; i++) {
			System.out.println(arrays2[i]);
		}
		System.out.println();
		// traversing elements by the other way: for-each
		for (int elements : arrays) {
			System.out.println(elements);
		}
		System.out.println();
		for (int elements : arrays2) {
			System.out.println(elements);
		}
	}

	/*
	 * Passing Array to a Method We can pass the java array to method so that we can
	 * reuse the same logic on any array
	 */
	public int getValueMin(int arrays[]) {
		int min = arrays[0];
		for (int i = 0; i < arrays.length; i++) {
			if (min > arrays[i]) {
				min = arrays[i];
			}
		}
		return min;
	}

	public void setValueMinFromArray() {
		int arrays[] = { 2, -1, -110, 90, 20 };
		System.out.println("Min value: " + getValueMin(arrays));
	}

	/*
	 * Anonymous Array
	 */
	public void show(int arrays[]) {
		for (int value : arrays) {
			System.out.println(value);
		}
	}

	public void getValueAnonymousArray() {
		show(new int[] { 11, 87, 23, 98, 12, 100 }); // this is called anonymous array
	}

	/*
	 * Returning Array
	 */
	public int[] getValueArray(int arrays[]) {
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] += 10; // arrays[i] = arrays[i] + 10;
		}
		return arrays;
	}

	public void setValueArray() {
		int arrays[] = getValueArray(new int[] { 1100, 2019, 3000, 300 });
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
	}

	/*
	 * B. Multidimensional Array
	 */
	public void initMultidimensional() {
		int arrays1[][] = new int[3][3]; // 3 rows and 3 columns
		int arrays2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3 rows and 3 columns
		// adding element to arrays1
		// {
		arrays1[0][0] = 1;
		arrays1[0][1] = 2;
		arrays1[0][2] = 3;
		// } // row 1
		// {
		arrays1[1][0] = 4;
		arrays1[1][1] = 5;
		arrays1[1][2] = 6;
		// } // row 2
		// {
		arrays1[2][0] = 7;
		arrays1[2][1] = 8;
		arrays1[2][2] = 9;
		// } row 3

		System.out.println("size arrays1: " + arrays1.length);
		System.out.println("size arrays2: " + arrays2.length);
		// print out
		System.out.println("Multidimensional Array 1: ");
		for (int i = 0; i < arrays1.length; i++) { // row
			arrays1[i][arrays1.length - 1] += 2;
			for (int j = 0; j < arrays1.length; j++) { // column
				System.out.print(arrays1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Multidimensional Array 2: ");
		for (int i = 0; i < arrays2.length; i++) {
			for (int j = 0; j < arrays2.length; j++) {
				System.out.print(arrays2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void changeValueEachColumn() {

		int arrays1[][] = new int[3][3]; // 3 rows and 3 columns
		// adding element to arrays1
		// {
		arrays1[0][0] = 1;
		arrays1[0][1] = 2;
		arrays1[0][2] = 3;
		// } // row 1
		// {
		arrays1[1][0] = 4;
		arrays1[1][1] = 5;
		arrays1[1][2] = 6;
		// } // row 2
		// {
		arrays1[2][0] = 7;
		arrays1[2][1] = 8;
		arrays1[2][2] = 9;
		// } row 3

		/*
		 * a[0][0] - a[0][1] - a[0][2] | a[1][0] - a[1][1] - a[1][2] | a[2][0] - a[2][1]
		 * - a[2][2] So, this diagonal line is: a[0][0] \ a[1][1] \ a[2][2]
		 */
		System.out.println("Change value of diagonal center line column: ");
		for (int i = 0; i < arrays1.length; i++) { // row
			arrays1[i][i] += 2; // value of diagonal line by increase 2
			for (int j = 0; j < arrays1.length; j++) { // column
				System.out.print(arrays1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Change value of 3rd column: ");
		for (int i = 0; i < arrays1.length; i++) { // row
			arrays1[i][arrays1.length - 1] += 2;
			for (int j = 0; j < arrays1.length; j++) { // column
				System.out.print(arrays1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Change value of 2nd column: ");
		for (int i = 0; i < arrays1.length; i++) { // row
			arrays1[i][arrays1.length - 2] += 2;
			for (int j = 0; j < arrays1.length; j++) { // column
				System.out.print(arrays1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Change value of 1st column: ");
		for (int i = 0; i < arrays1.length; i++) { // row
			arrays1[i][i] += 2;
			for (int j = 0; j < arrays1.length; j++) { // column
				System.out.print(arrays1[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * Jagged Array
	 */
	public int[][] getValueJaggedArrays() {
		int arrays[][] = new int[3][];
		arrays[0] = new int[3]; // 1st row include 3 values
		arrays[1] = new int[5]; // 2nd row include 5 values
		arrays[2] = new int[8]; // 3rd row include 8 values
		int count = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				arrays[i][j] = count++;
			}
		}
		return arrays;
	}

	public void showJaggedArrays() {
		int arrays[][] = getValueJaggedArrays();
		System.out.println("Jagged Array:");
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void copyArray() {
		char arrays[] = { 'p', 'h', 'u', 'o', 'c', 'n', 'g', 'u', 'y', 'e', 'n' };
		char copyArray[] = new char[5];
		System.arraycopy(arrays, 1, copyArray, 0, 5); // System.arraycopy(initArray, indexOfFirstArray,
														// destinationArray, indexToStartCopy, LengthOfDestinationArray)
		System.out.println("Array is copied: " + String.valueOf(copyArray));
	}

	public void cloneArray() {
		int arrays[] = { 1, 2, 3, 4, 5, 6 };
		int cloneArray[] = arrays.clone();
		for (int value : cloneArray) {
			System.out.print(value + " ");
		}
	}

	public void addTwoArrays() {
		int arrays1[][] = new int[3][3]; // 3 rows and 3 columns
		int arrays2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3 rows and 3 columns
		// adding element to arrays1
		// {
		arrays1[0][0] = 1;
		arrays1[0][1] = 2;
		arrays1[0][2] = 3;
		// } // row 1
		// {
		arrays1[1][0] = 4;
		arrays1[1][1] = 5;
		arrays1[1][2] = 6;
		// } // row 2
		// {
		arrays1[2][0] = 7;
		arrays1[2][1] = 8;
		arrays1[2][2] = 9;
		// } row 3

		// declared array to store value
		int[][] addArray = new int[3][3];

		for (int i = 0; i < addArray.length; i++) {
			for (int j = 0; j < addArray.length; j++) {
				addArray[i][j] = arrays1[i][j] + arrays2[i][j];
			}
		}
		System.out.println("Arrays after two arrays add together: ");
		for (int i = 0; i < addArray.length; i++) {
			for (int j = 0; j < addArray.length; j++) {
				System.out.print(addArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void writeToFileUsingBufferWriter(String contents) throws IOException {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		fileWriter = new FileWriter(SET_NAME_FILE, true);
		bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(String.valueOf(contents));
		bufferedWriter.close();
		fileWriter.close();
	}

	public void multiplicationTwoArrays() {
		int arrays1[][] = new int[3][3]; // 3 rows and 3 columns
		int arrays2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3 rows and 3 columns
		// adding element to arrays1
		// {
		arrays1[0][0] = 1;
		arrays1[0][1] = 2;
		arrays1[0][2] = 3;
		// } // row 1
		// {
		arrays1[1][0] = 4;
		arrays1[1][1] = 5;
		arrays1[1][2] = 6;
		// } // row 2
		// {
		arrays1[2][0] = 1;
		arrays1[2][1] = 2;
		arrays1[2][2] = 3;
		// } row 3

		// declared array to store value
		int[][] addArray = new int[3][3];

		for (int i = 0; i < arrays1.length; i++) {
			for (int j = 0; j < arrays2.length; j++) {
				addArray[i][j] = 0;
				for (int j2 = 0; j2 < addArray.length; j2++) {
					addArray[i][j] += arrays1[i][j2] * arrays2[j2][j];
				}
			}
		}
		System.out.println("Arrays after multiplication two arrays: ");
		for (int i = 0; i < addArray.length; i++) {
			for (int j = 0; j < addArray.length; j++) {
				System.out.print(addArray[i][j] + " " + "|");
				// write to file {
				try {
					writeToFileUsingBufferWriter(addArray[i][j] + " " + "|");
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				// }
			}
			System.out.println();
			// add new line {
			try {
				writeToFileUsingBufferWriter("\n");
			} catch (IOException e) {
				System.out.println(e.getLocalizedMessage());
			}
			// }
		}

	}

	public void transferToString() {
		int arrays[] = { 1, 2, 3, 4, 5, 6 };
		String arraysToString = Arrays.toString(arrays);
		System.out.println(arraysToString);
	}

	public void createArrayListFromArrays() {
		String arrays[] = { "a", "b", "c", "d" };
		List<String> list = new ArrayList<String>(Arrays.asList(arrays));
		for (String value : list) {
			System.out.println(value);
		}
	}

	public void checkArraysContainValue() {
		String arrays[] = { "a", "b", "c", "d" };
		boolean check = Arrays.asList(arrays).contains("b");
		System.out.println(check);

	}

	public void convertArrayListToArray() {
		String arrays[] = { "a", "b", "c", "d", "e" };
		List<String> list = new ArrayList<String>(Arrays.asList(arrays));
		String[] subStringArray = new String[list.size()];

		list.toArray(subStringArray);

		for (String value : subStringArray) {
			System.out.println(value);
		}
	}

	public void convertArrayToSet() {
		String arrays[] = { "a", "b", "c", "d", "e" };
		Set<String> set = new HashSet<String>(Arrays.asList(arrays));
		for (String value : set) {
			System.out.println(value);
		}

	}

	public void insertIntoArrays(int arrays[], int index, int value) {
		for (int i = arrays.length - 1; i > index; i--) {
			arrays[i] = arrays[i - 1];

		}
		// insert new value
		arrays[index] = value;
	}

	public void handleInsertIntoArray() {
		int arrays[] = new int[10];
		insertIntoArrays(arrays, 0, 20);
		insertIntoArrays(arrays, 3, 15);
		for (int value : arrays) {
			System.out.print(value + " ");
		}
	}

	public void removeFromArray(int arrays[], int index) {
		for (int i = index; i < arrays.length - 1; i++) {
			arrays[i] = arrays[i + 1]; // After the removal, the last element in the array will exist twice. Both in
										// the last and second last element.
		}
	}

	public void handleRemoveFromArray() {
		int arrays[] = { 1, 2, 3, 4, 5, 6 };
		removeFromArray(arrays, 2);
		for (int value : arrays) {
			System.out.print(value + " ");
		}
	}

	public void copyArrayUsingIterating(int arraysSource[], int arraysDestination[]) {
		for (int i = 0; i < arraysSource.length; i++) {
			arraysSource[i] = i;
		}
		for (int i = 0; i < arraysDestination.length; i++) {
			arraysDestination[i] = arraysSource[i];
		}
	}

	public void handleCopyArrayUsingIterating() {
		System.out.println("Copying an Array by Iterating the Array: ");
		// First two integer arrays are created. Second, the source array is initialized
		// with values from 0 to 9 (0 to the length of the array minus 1). Third, each
		// element in the source array is copied into the destination array.
		int source[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int destination[] = new int[source.length];
		copyArrayUsingIterating(source, destination);
		for (int value : destination) {
			System.out.print(value + " ");
		}
	}

	public void copyArrayUsingArrayscopyOf() {
		System.out.println("Copying an Array Using Arrays.copyOf(): ");
		int source[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		for (int i = 0; i < source.length; i++) {
			source[i] = i;
		}
		int destination[] = Arrays.copyOf(source, source.length);
		for (int value : destination) {
			System.out.print(value + " ");
		}
	}

	public void copyArrayUsingArrayscopyOfRange() {
		System.out.println("Copying an Array Using Arrays.copyOfRange(): ");
		int source[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		for (int i = 0; i < source.length; i++) {
			source[i] = i;
		}
		int destination[] = Arrays.copyOfRange(source, 0, source.length);
		for (int value : destination) {
			System.out.print(value + " ");
		}
	}

	public void sortArrays() {
		int source[] = { 99, 12, 65, -1, 34, 13, 200, 130, 230 };
		Arrays.sort(source);

		System.out.println("Sort the elements of an array using the Arrays.sort() method: ");
		for (int value : source) {
			System.out.print(value + " ");
		}

	}

	public void sortObject() {
		Person person[] = new Person[4];
		person[0] = new Person("phuocnguyen", 1);
		person[1] = new Person("david", 3);
		person[2] = new Person("phuoclong", 2);
		person[3] = new Person("phuoclong", 5);

		// sorting
		System.out.println("Sort by name: ");
		Arrays.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		for (Person listPerson : person) {
			System.out.println(listPerson.toString());
		}

		// ************
		System.out.println("Sort by id: ");
		Arrays.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getId() - o2.getId();
			}

		});

		for (Person listPerson : person) {
			System.out.println(listPerson.toString());
		}

		// ****************
		System.out.println("Sort name or id when has the name is same!");
		Arrays.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				int nameCompare = o1.getName().compareTo(o2.getName());
				if (nameCompare != 0) {
					return nameCompare;
				}
				return o1.getId() - o2.getId();
			}

		});

		for (Person listPerson : person) {
			System.out.println(listPerson.toString());
		}

	}

	public void fillingArrays() {
		int arrays[] = new int[5];
		// Arrays.fill(arrays, 1109);
		System.out.println(Arrays.toString(arrays));
		Arrays.fill(arrays, 1, 3, 1109);
		System.out.println(Arrays.toString(arrays));

	}

	public void searchArraysUsingArraysBinarySearch() {
		int arrays[] = { 1, 3, 7, 8, 12, 10 };
		int search = Arrays.binarySearch(arrays, 10);
		System.out.println(search);
	}

}
