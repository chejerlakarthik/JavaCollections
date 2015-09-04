/**
 * 
 */
package org.tutorials.collections.examples.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Yashoda
 * 
 */
public class HashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> cities = new HashSet<String>();

		cities.add(new String("Trivandrum"));
		cities.add(new String("Mumbai"));
		cities.add(new String("Hyderabad"));
		cities.add(new String("New Delhi"));
		cities.add(new String("Mumbai"));
		cities.add(new String("Bengaluru"));

		Iterator<String> iterator = cities.iterator();

		// The output will be as entered in the list - 'Ordered' but not sorted.
		// Duplicates not allowed in a Set
		// If you want a fast set, use HashSet. If you want the insertion order
		// to be maintained, use LinkedHashSet.
		while (iterator.hasNext())
			System.out.println("City name is : " + iterator.next());

		return;

	}

}
