/**
 * 
 */
package org.tutorials.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Yashoda
 *
 */
public class SortingCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Sorting a list of Integers
		List<Integer> marks = new ArrayList<Integer>();
		
		marks.add(85);
		marks.add(90);
		marks.add(75);
		marks.add(82);

		System.out.println("Before Sorting:\t" + marks);
		Collections.sort(marks);
		System.out.println("After Sorting:\t" + marks);
		
		// Sorting a set of Students based on their weight
		Student karthik = new Student("Karthik", 75.0, 175.0);
		Student aarthi = new Student("Aarthi",65.0, 180.0);
		Student xyz = new Student("xyz",70.0, 166.5);
		
		Set<Student> setOfStudents = new LinkedHashSet<Student>();
		setOfStudents.add(karthik);
		setOfStudents.add(aarthi);
		setOfStudents.add(xyz);
		
		List<Student> newList = new ArrayList<Student>();
		newList.addAll(setOfStudents);
		
		// sorts based on weight. uses comparable interface's compareTo method
		System.out.println("\n\nComparable Interface's - compareTo method");
		System.out.println("Before Sorting:\t" + newList);
		Collections.sort(newList);
		System.out.println("After Sorting:\t" + newList);
		
		// sorts based on height. uses comparator interface's compare method
		System.out.println("\n\nComparator Interface's - compare method");
		System.out.println("Before Sorting:\t" + newList);
		Collections.sort(newList, Student.studentComparator);
		System.out.println("After Sorting:\t" + newList);
	}

}
