package Decorator.Beverage;

public abstract class Beverage {
	
	public String description;
	
	// description�� ��ȯ�Ѵ�.
	public String getDescription() {
		return description;
	}
	
	// cost�� ��ȯ�Ѵ�.
	public abstract double cost();
}
