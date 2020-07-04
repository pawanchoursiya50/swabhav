package com.techlabs.factory;

public class BMWFactory implements IAutoFactory {

	private static BMWFactory factory;
	private BMWFactory() {}
	
	public static BMWFactory getInstance() {
		if(factory == null) {
			factory = 	new BMWFactory();
		}
		return factory;
	}
	
	@Override
	public IAuto make() {
		return new BMW();
	}
}
