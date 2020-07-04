package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.TeslaFactory;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		IAutoFactory factory = injectDependency();
		System.out.println(factory.getClass().getSimpleName());
		
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
		injectDependency();
	}
	
	private static IAutoFactory injectDependency() throws Exception{
		
//		FileInputStream input = new FileInputStream("G:\\swabhav\\OOAD\\27-06-2020\\factoryMethod-app\\Dependency\\Factory.properties");
		FileInputStream input = new FileInputStream("./././././Dependency/Factory.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		String factory =  prop.getProperty("factory");
		
		Method method = Class.forName(factory).getDeclaredMethod("getInstance", null);
		
		return (IAutoFactory) method.invoke(null, null);
		
	}

}
