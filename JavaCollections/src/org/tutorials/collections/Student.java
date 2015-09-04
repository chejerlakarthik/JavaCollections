/**
 * 
 */
package org.tutorials.collections;

import java.util.Comparator;

/**
 * @author Yashoda
 * 
 */
public class Student implements Comparable<Student>{

	private String name;
	private double weightInKg;
	private double heightInCm;

	public Student() {
		this.name = "Karthik";
		this.weightInKg = 50.0;
		this.heightInCm = 175.0;
	}

	public Student(String name, double weightInKg, double heightInCm) {
		this.name = name;
		this.weightInKg = weightInKg;
		this.heightInCm = heightInCm;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weightInKg
	 */
	public double getWeightInKg() {
		return weightInKg;
	}

	/**
	 * @param weightInKg
	 *            the weightInKg to set
	 */
	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}

	
	/**
	 * @return the heightInCm
	 */
	public double getHeightInCm() {
		return heightInCm;
	}

	/**
	 * @param heightInCm the heightInCm to set
	 */
	public void setHeightInCm(double heightInCm) {
		this.heightInCm = heightInCm;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	/**
	 * The comparator 
	 * 
	 */
	public static final Comparator<Student> studentComparator = new Comparator<Student>() 
	{
		@Override
		public int compare(Student s1, Student s2) 
		{
			return (int) (s1.getHeightInCm() - s2.getHeightInCm());
		}
	};
	
	@Override
	public int compareTo(Student o) {
		
		return (int) (this.weightInKg - o.getWeightInKg());
	}
}
