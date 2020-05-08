package com.techlab.model;

import java.net.*;
import java.util.TreeSet;
import java.io.*;

public class URLReader {

	public static void main(String[] args) {
		TreeSet output = getUrlContents("https://swabhav-tech.firebaseapp.com/emp.txt");
		printDetails(output);
	}

	private static void printDetails(TreeSet output) {
		int count = 0;

		System.out.println("empid,ename,role,managerId,doj,salary,comm and deptno");
		for (Object t : output) {
			count++;
			System.out.println(count + ":" + t);
		}
	}

	private static TreeSet getUrlContents(String theUrl) {
		StringBuilder content = new StringBuilder();
		TreeSet tree = new TreeSet();
		try {
			URL url = new URL(theUrl);
			URLConnection urlConnection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
				tree.add(line);
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tree;
	}
}
