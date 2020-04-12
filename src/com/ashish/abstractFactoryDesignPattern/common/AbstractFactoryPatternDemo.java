package com.ashish.abstractFactoryDesignPattern.common;

import java.util.Scanner;

import com.ashish.abstractFactoryDesignPattern.color.Color;
import com.ashish.abstractFactoryDesignPattern.shape.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {


		while(true){
			
			System.out.println("Enter Shape you want to draw");
			System.out.println("1. "+Constants.CIRCLE+"\n"+"2. "+Constants.RECTANGLE+"\n"+"3. "+Constants.SQUARE);
			System.out.println();
			
			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();
			
			//get shape factory
			AbstractFactory shapeFactory = FactoryProducer.getFactory(Constants.SHAPE);

			Shape shape = null;
			switch (choice) {
			case 1:
				shape = shapeFactory.getShape(Constants.CIRCLE);
				break;
			case 2:
				shape = shapeFactory.getShape(Constants.RECTANGLE);
				break;
			case 3:
				shape = shapeFactory.getShape(Constants.SQUARE);
				break;
			default:
				return;
				
			}
			if(shape != null)
				shape.draw();

			System.out.println("Enter the Color you want to fill");
			System.out.println("1. "+Constants.RED+"\n"+"2. "+Constants.GREEN+"\n"+"3. "+Constants.BLUE);
			
			//Scanner inColor = new Scanner(System.in);
			int choiceColor = in.nextInt();
			AbstractFactory colorFactory = FactoryProducer.getFactory(Constants.COLOR);
			Color color = null;
			switch (choiceColor) {
			case 1:
				color = colorFactory.getColor(Constants.RED);
				break;
			case 2:
				color = colorFactory.getColor(Constants.GREEN);
				break;
			case 3:
				color = colorFactory.getColor(Constants.BLUE);
				break;
			default:
				break;
			}

			color.fill();

		}
	}

}
