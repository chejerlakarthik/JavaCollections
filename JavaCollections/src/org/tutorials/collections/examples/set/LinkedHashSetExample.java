/**
 * 
 */
package org.tutorials.collections.examples.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Yashoda
 * 
 */
public class LinkedHashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> cities = new LinkedHashSet<String>();

		cities.add("Trivandrum");
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Bengaluru");

		Iterator<String> iterator = cities.iterator();

		// The output will be as entered in the list - 'Ordered' but not sorted.
		// Duplicates not allowed in a Set
		// If you want the insertion order
		// to be maintained, use LinkedHashSet.
		while (iterator.hasNext())
			System.out.println("City name is : " + iterator.next());

		return;

	}

}
