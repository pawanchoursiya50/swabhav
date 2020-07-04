package com.techlabs.products;

public class AutoMobileFactory {
	
	private static AutoMobileFactory bucket;
	private AutoMobileFactory() {}
	
	public static AutoMobileFactory getInstance() {
		if(bucket == null) {
			bucket = new AutoMobileFactory();
		}
		return bucket;
	}

	public IAuto make(AutoType type) {
		if(type == AutoType.Audi) {
			return new Audi();
		}
		else if(type == AutoType.BMW) {
			return new BMW();
		}
		else {
			return new Tesla();
		}
	}
}
