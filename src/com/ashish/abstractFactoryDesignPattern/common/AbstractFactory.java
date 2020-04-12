package com.ashish.abstractFactoryDesignPattern.common;

import com.ashish.abstractFactoryDesignPattern.color.Color;
import com.ashish.abstractFactoryDesignPattern.shape.Shape;

public abstract class AbstractFactory {
	
	protected abstract Color getColor(String color);
	protected  abstract Shape getShape(String shape);

}
