package com.techlab.model;

public class Student implements Comparable<Student>{

	private int roll;
	private int std;
	private String name;
	private double cgpa;
	
	public Student(int roll, int std, String name, double cgpa) {
		this.roll = roll;
		this.std = std;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cgpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		result = prime * result + std;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		if (std != other.std)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		if(this.getRoll() == o.getRoll() && this.getStd() == o.getStd()) {
			return 0;
		}
		
		if(this.getRoll() == o.getRoll()) {
	
			return (this.getStd() > o.getStd()) ? 1 : -1 ;
		}
		else {
			return (this.getRoll() > o.getRoll()) ? 1 : -1;
		}
		
	}
	

	public int getRoll() {
		return roll;
	}

	public int getStd() {
		return std;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}



	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", std=" + std + ", name=" + name + ", cgpa=" + cgpa + "]";
	}




	
	
	
	
}
