package com.ashish.abstractFactoryDesignPattern.shape;

import com.ashish.abstractFactoryDesignPattern.common.*;
import com.ashish.abstractFactoryDesignPattern.color.Color;

public class ShapeFactory extends AbstractFactory {

	@Override
	protected
	Color getColor(String color) {
		

		return null;

	}

	@Override
	protected
	Shape getShape(String shape) {

		if (shape == null) {
			return null;
		}else if (shape.equals(Constants.CIRCLE)) {
			return new Circle();
		}else if (shape.equals(Constants.RECTANGLE)) {
			return new Rectangle();
		}else if (shape.equals(Constants.SQUARE)) {
			return new Square();
		}

		return null;
	}



}
