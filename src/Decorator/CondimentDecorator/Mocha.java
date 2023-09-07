package Decorator.CondimentDecorator;

import Decorator.Beverage.Beverage;

public class Mocha extends CondimentDeco {
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 700+this.beverage.cost();
	}

	@Override
	public String getDescription() {
		return this.beverage.description+",¸ðÄ«";
	}

}
