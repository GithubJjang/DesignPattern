package Decorator.CondimentDecorator;

import Decorator.Beverage.Beverage;

public class Milk extends CondimentDeco {
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 500+this.beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return this.beverage.description+",¿ìÀ¯";
	}
	

}
