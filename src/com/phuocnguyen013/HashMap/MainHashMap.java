package com.phuocnguyen013.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainHashMap {

	public static void main(String[] args) {
		Person per1 = new Person(2, "A");
		Person per2 = new Person(1, "G");
		Person per3 = new Person(3, "L");
		// Declare HashMap

		Map<Integer, Person> listHashMap = new HashMap<Integer, Person>();

		// Add object into HashMap

		listHashMap.put(1, per1);
		listHashMap.put(2, per2);
		listHashMap.put(null, per3);
		// Get element

		// Show

		System.out.println(listHashMap.get(2));
		System.out.println(listHashMap.get(null));

		System.out.println();

		// Remove : key is Integer

		listHashMap.remove(1);

		// Loop to get element

		// Show 1 : key is Integer

		Set<Integer> keySet = listHashMap.keySet();
		for (Integer k : keySet) {
			System.out.println(k + " - " + listHashMap.get(k));
		}

		System.out.println();
		// Show 2

		for (Entry<Integer, Person> subHashMap : listHashMap.entrySet()) {
			System.out.println(subHashMap.getKey() + " - " + subHashMap.getValue());
		}

	}

}
