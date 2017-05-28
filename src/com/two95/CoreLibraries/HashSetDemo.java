package com.two95.CoreLibraries;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		// Add objects.
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("ABC");
		// Get the iterator
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println(s1);
		}

	}
}
