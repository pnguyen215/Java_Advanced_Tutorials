package com.phuocnguyen005.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSort {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("b");
		for (String str : list) {
			System.out.println(str.toString());
		}
		System.out.println("After sort list: ");
		Collections.sort(list);
		for (String str : list) {
			System.out.println(str.toString());
		}
	}

}
