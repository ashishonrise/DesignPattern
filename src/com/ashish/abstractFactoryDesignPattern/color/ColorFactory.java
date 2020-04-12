package com.ashish.abstractFactoryDesignPattern.color;

import com.ashish.abstractFactoryDesignPattern.common.*;
import com.ashish.abstractFactoryDesignPattern.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public
	Color getColor(String color) {
		if (color == null) {
			return null;
		}else if(color.equalsIgnoreCase(Constants.RED)){
			return new Red();
		}else if (color.equalsIgnoreCase(Constants.BLUE)) {
			return new Blue();
		}else if (color.equalsIgnoreCase(Constants.GREEN)) {
			return new Green();
		}
		return null;

	}


	@Override
	protected
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
