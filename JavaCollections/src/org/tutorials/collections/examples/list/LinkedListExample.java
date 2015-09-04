/**
 * 
 */
package org.tutorials.collections.examples.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Yashoda
 * 
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> citiesList = new LinkedList<String>();

		citiesList.add("Mumbai");
		citiesList.add("Hyderabad");
		citiesList.add("New Delhi");
		citiesList.add("Mumbai");

		Iterator<String> iterator = citiesList.iterator();

		while (iterator.hasNext())
			System.out.println("City name: " + iterator.next());

		return;

	}

}
