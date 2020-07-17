package com.techlabs.client;


import com.techlabs.client.frames.Frames;
import com.techlabs.components.DiskLoader;
import com.techlabs.components.Employee;
import com.techlabs.components.OrgHierarchyBuilder;

public class Test {

	public static void main(String[] args) {
		
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new DiskLoader());
		Employee emp = builder.getCEO();
		
		System.out.println(emp.show(0));
		
		new Frames(builder);
	}

}
