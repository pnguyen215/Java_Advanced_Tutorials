package com.phuocnguyen014.TreeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MainTreeMap {

	public static void main(String[] args) {

		Person per1 = new Person(1, "S");
		Person per2 = new Person(3, "F");
		Person per3 = new Person(5, "T");

		// Declare TreeMap

		Map<Integer, Person> listTreeMap = new TreeMap<Integer, Person>();

		listTreeMap.put(1, per1);
		listTreeMap.put(2, per2);
		listTreeMap.put(3, per3);
		listTreeMap.put(0, per1);

		// Remove

		listTreeMap.remove(3);

		// Show 1

		Set<Integer> keySet = listTreeMap.keySet();

		for (Integer k : keySet) {
			System.out.println(k + " --- " + listTreeMap.get(k));
		}

		System.out.println();

		// Show 2

		for (Entry<Integer, Person> subTreeMap : listTreeMap.entrySet()) {
			System.out.println(subTreeMap.getKey() + " --- " + subTreeMap.getValue());
			System.out.println(subTreeMap.toString());
		}

	}

}
