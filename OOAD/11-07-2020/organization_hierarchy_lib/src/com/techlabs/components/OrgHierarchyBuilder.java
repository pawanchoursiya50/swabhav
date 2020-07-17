package com.techlabs.components;

import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

public class OrgHierarchyBuilder {

	List<Employee> emplList;

	public OrgHierarchyBuilder(DataLoader loader) {
		this.emplList = loader.loadData();
		buildHierarchy();
	}

	private void buildHierarchy() {
		for (Employee emp : emplList) {
			for (Employee anotherEmp : emplList) {
				if (emp.getEmpid() == anotherEmp.getMg_id()) {
					emp.addReporttee(anotherEmp);
				}
			}
		}
	}

	public Employee getCEO() {
		for (Employee emp : emplList) {
			if (emp.getJob().equalsIgnoreCase("'PRESIDENT'")) {
				return emp;
			}
		}
		return null;
	}
}
