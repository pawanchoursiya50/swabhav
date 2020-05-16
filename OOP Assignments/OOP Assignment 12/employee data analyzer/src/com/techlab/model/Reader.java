package com.techlab.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Reader {
	ArrayList<String> data = new ArrayList<String>();
	private String file;

	public Reader(String file) {
		this.file = file;
	}

	public ArrayList<String> read() {
		if (urlValidator()) {
			readURL();
		} else if (fileValidator()) {
			readTextFile();
		} else {
			System.err.println("Please enter a valid url or file address");
		}
		return data;
	}

	public boolean urlValidator() {
		try {
			new URL(file).toURI();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void readURL() {
		try {
			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				data.add(line);
			}
			reader.close();
		} catch (MalformedURLException e) {
			System.out.println("URL not found " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O Error: " + e.getMessage());
		}
	}

	public boolean fileValidator() {
		File myFile = new File(file);
		return (myFile.exists());

	}

	public void readTextFile() {
		try {
			File myFile = new File(file);
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			String line;
			while (((line = reader.readLine()) != null)) {
				data.add(line);
			}
			reader.close();

		} catch (Exception e) {
			System.out.println("Invalid file:");
		}

	}

}