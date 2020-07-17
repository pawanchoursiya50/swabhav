package com.tachlabs.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	String[][] details = new String[16][8];

	public String[][] read(String link) throws IOException {
		String line;
		int row = 0;
		BufferedReader reader = new BufferedReader(new FileReader(link));

		while ((line = reader.readLine()) != null) {
			String[] words = line.split(",");
			for (int i = 0; i < words.length; i++) {
				details[row][i] = words[i];
			}
			row++;
		}
		reader.close();

		return details;
	}
}
