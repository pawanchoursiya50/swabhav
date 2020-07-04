package com.techlabs.factory;

public class TeslaFactory implements IAutoFactory{

	private static TeslaFactory factory;
	private TeslaFactory() {}
	
	public static TeslaFactory getInstance() {
		if(factory == null) {
			factory = 	new TeslaFactory();
		}
		return factory;
	}
	
	@Override
	public IAuto make() {
		return new Tesla();
	}

}
