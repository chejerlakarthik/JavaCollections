/**
 * 
 */
package org.tutorials.collections.examples.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Yashoda
 * 
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<String> citiesList = new Vector<String>();

		citiesList.add("Mumbai");
		citiesList.add("Hyderabad");
		citiesList.add("New Delhi");
		citiesList.add("Mumbai");

		Iterator<String> iterator = citiesList.iterator();

		while (iterator.hasNext())
			System.out.println("City name: " + iterator.next());

		
		//Using enumeration
		Enumeration<String> enumer = citiesList.elements();
		
		while(enumer.hasMoreElements())
		{
			System.out.println(enumer.nextElement());
		}
		
		return;
	}

}
