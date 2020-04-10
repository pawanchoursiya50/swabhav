package com.techlab.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class File {


	public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("myFile.properties");
		Properties props  = new Properties();
		props.load(input);
		Set<String> keys = props.stringPropertyNames();
		usingForEach(keys, props);
		
		iterator(props);
	}
	
	public static void usingForEach(Set<String> keys, Properties props) {
		for (String key : keys) {
			System.out.println(key + " : " + props.getProperty(key));
		}
	}

	public static void iterator(Properties props) {
		Iterator<?> keyIterator = props.keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next();
			String value = props.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}
	
}
