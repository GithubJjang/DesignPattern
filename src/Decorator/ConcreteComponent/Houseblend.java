package Decorator.ConcreteComponent;

import Decorator.Beverage.Beverage;

public class Houseblend extends Beverage {
	
	public Houseblend() {
		super.description="하우스 블랜드 커피";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2000;
	}

	
}
