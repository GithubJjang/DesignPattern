package Decorator.ConcreteComponent;

import Decorator.Beverage.Beverage;

public class Houseblend extends Beverage {
	
	public Houseblend() {
		super.description="�Ͽ콺 ���� Ŀ��";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2000;
	}

	
}
