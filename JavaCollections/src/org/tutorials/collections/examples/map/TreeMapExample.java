/**
 * 
 */
package org.tutorials.collections.examples.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Yashoda
 * 
 */
public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Long, String> employeeDetails = new TreeMap<Long, String>();
		Entry<Long, String> entry = null;

		employeeDetails.put(new Long(539471), new String("Chejerla Karthik"));
		employeeDetails.put(new Long(540854), new String("Aarthi Sundar"));
		employeeDetails.put(new Long(539472), new String("Narahari"));

		Set<Map.Entry<Long, String>> empSet = employeeDetails.entrySet();

		Iterator<Entry<Long, String>> iter = empSet.iterator();

		// Output is sorted on the key. Hence, sorted but ordered by natural
		// order of elements.
		while (iter.hasNext()) {
			entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		employeeDetails.put(new Long(540854), new String("Archana Sundar"));

		empSet = employeeDetails.entrySet();
		iter = empSet.iterator();

		while (iter.hasNext()) {
			entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
