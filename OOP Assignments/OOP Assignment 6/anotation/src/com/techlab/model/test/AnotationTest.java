package com.techlab.model.test;

import java.lang.reflect.Method;
import com.techlab.model.Anotation;
import com.techlab.model.NeedToRefactor;

public class AnotationTest {

	public static void main(String args[]) {
		Anotation run = new Anotation();
        Method[] methods = run.getClass().getMethods();
        
        for (Method method : methods) {
        	NeedToRefactor annos = method.getAnnotation(NeedToRefactor.class);
        	if(annos != null) {
        		System.out.println("Need to change "+method.getName());
        	}
        }


	}

}
