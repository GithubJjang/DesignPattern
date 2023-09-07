package Decorator.CondimentDecorator;

import Decorator.Beverage.Beverage;

public abstract class CondimentDeco extends Beverage{
	public Beverage beverage;
	public abstract String getDescription();
}
