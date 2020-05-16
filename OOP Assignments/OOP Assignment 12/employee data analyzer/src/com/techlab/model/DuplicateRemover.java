package com.techlab.model;

import java.util.Comparator;

public class DuplicateRemover implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getDesignation() == o2.getDesignation() && o1.getManagerId() == o2.getManagerId()
				&& o1.getEmpId() == o2.getEmpId() && o1.getEname() == o2.getEname()
				&& o1.getDob() == o2.getDob() && o1.getSalary() == o2.getSalary()
				&& o1.getComm() == o2.getComm() && o1.getDeptNo() == o2.getDeptNo()) {
			return 0;
		}
		if (o1.getSalary() > o2.getSalary())
			return 1;

		return -1;

	}

}
