/**
 * 
 */
package org.tutorials.collections.examples.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Yashoda
 * 
 */
public class ArrayListExample {

	public static void main(String[] args) {

		List<String> citiesList = new ArrayList<String>();

		citiesList.add("Mumbai");
		citiesList.add("Hyderabad");
		citiesList.add("New Delhi");
		citiesList.add("Mumbai");
		
		Iterator<String> iterator = citiesList.iterator();
		
		while(iterator.hasNext())
			System.out.println("City name: "+ iterator.next());
		
		return;
		
	}

}
