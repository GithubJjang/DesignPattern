package Decorator.Beverage;

public abstract class Beverage {
	
	public String description;
	
	// description을 반환한다.
	public String getDescription() {
		return description;
	}
	
	// cost를 반환한다.
	public abstract double cost();
}
