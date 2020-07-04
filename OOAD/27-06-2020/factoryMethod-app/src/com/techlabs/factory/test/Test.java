package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.TeslaFactory;

public class Test {

	public static void main(String[] args) throws IOException {
		
		IAutoFactory factory = TeslaFactory.getInstance();
		System.out.println(factory.getClass().getSimpleName());
		
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
		injectDependency();
	}
	
	private static void injectDependency() throws IOException{
		FileInputStream input = new FileInputStream("G:\\swabhav\\OOAD\\27-06-2020\\factoryMethod-app\\Dependency\\Factory.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		for(Object value : prop.keySet()) {
			System.out.println(prop.getProperty(value.toString()));
		}
	}

}
