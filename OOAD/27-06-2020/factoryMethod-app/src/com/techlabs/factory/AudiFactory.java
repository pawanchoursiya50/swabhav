package com.techlabs.factory;

public class AudiFactory implements IAutoFactory{
	
	private static AudiFactory factory;
	private AudiFactory() {}
	
	public static AudiFactory getInstance() {
		if(factory == null) {
			factory = 	new AudiFactory();
		}
		return factory;
	}
	
	@Override
	public IAuto make() {
		return new Audi();
	}
}
