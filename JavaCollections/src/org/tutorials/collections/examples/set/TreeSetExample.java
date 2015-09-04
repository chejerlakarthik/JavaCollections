/**
 * 
 */
package org.tutorials.collections.examples.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Yashoda
 * 
 */
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SortedSet<String> cities = new TreeSet<String>();

		cities.add("Trivandrum");
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("New Delhi");
		cities.add("Mumbai");

		Iterator<String> iterator = cities.iterator();

		// The output will be  'Ordered' & 'Sorted'.
		// Duplicates not allowed in a Set
		while (iterator.hasNext())
			System.out.println("City name is : " + iterator.next());

		System.out.println("First element in the set is : " + cities.first());
		System.out.println("Last element in the set is : " + cities.last());
		
		return;

	}

}
