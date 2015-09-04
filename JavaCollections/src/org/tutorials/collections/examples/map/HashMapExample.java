/**
 * 
 */
package org.tutorials.collections.examples.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yashoda
 * 
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Long, String> employeeDetails = new HashMap<Long, String>();
		
		//Iteration Approach #1
		System.out.println("Iteration Approach #1");
		Entry<Long, String> entry = null;

		employeeDetails.put(new Long(539471), new String("Chejerla Karthik"));
		employeeDetails.put(new Long(540854), new String("Aarthi Sundar"));
		employeeDetails.put(new Long(539472), new String("Narahari"));
		employeeDetails.put(null, new String("Null Employee"));
		employeeDetails.put(null, null);

		Iterator<Entry<Long, String>> iter = employeeDetails.entrySet().iterator();

		//Output depends on the hash-code of the key here. Hence, unordered & unsorted.
		while (iter.hasNext()) 
		{
			entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		//Iteration Approach #2
		System.out.println("\n\nIteration Approach #2");
		for(Long key : employeeDetails.keySet())
		{
			System.out.println("Key is: " + key + "\tValue is: " + employeeDetails.get(key) );
		}
		
		
		//Iteration Approach #3
		System.out.println("\n\nIteration Approach #3");
		Set<Entry<Long,String>> entrySet = employeeDetails.entrySet();
		
		for(Entry<Long, String> ent : entrySet)
		{
			System.out.println("Key: " + ent.getKey() + "\tValue: " + ent.getValue());
		}
	}

}
