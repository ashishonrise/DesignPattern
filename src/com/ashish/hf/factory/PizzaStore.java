package com.ashish.hf.factory;

import com.ashish.hf.factory.model.Pizza;

public class PizzaStore {

	SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		simplePizzaFactory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = simplePizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
