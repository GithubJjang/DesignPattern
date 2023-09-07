package Decorator.ConcreteComponent;

import Decorator.Beverage.Beverage;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		super.description="엄청나게 볶은 다크로스트 커피";
	}

	@Override
	public double cost() {
		return 1500;
	}

}
