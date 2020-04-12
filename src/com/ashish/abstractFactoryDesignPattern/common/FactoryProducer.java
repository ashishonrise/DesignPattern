package com.ashish.abstractFactoryDesignPattern.common;

import com.ashish.abstractFactoryDesignPattern.color.*;
import com.ashish.abstractFactoryDesignPattern.shape.ShapeFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		
		if (choice.equalsIgnoreCase(Constants.SHAPE)) {
			return new ShapeFactory();
		}else if (choice.equalsIgnoreCase(Constants.COLOR)) {
			return new ColorFactory();
		}
		return null;
	}
}
