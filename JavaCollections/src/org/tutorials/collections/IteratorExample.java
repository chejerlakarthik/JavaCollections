/**
 * 
 */
package org.tutorials.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Yashoda
 *
 */
public class IteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			iterator.next();
			iterator.remove();
			System.out.println(iterator.next());
		}
		
		System.out.println(list);
	}

}
