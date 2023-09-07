package Decorator;

import Decorator.ConcreteComponent.DarkRoast;
import Decorator.CondimentDecorator.Milk;

public class Main {

	public static void main(String[] args) {
		DarkRoast d1 = new DarkRoast();
		
		Milk m1 = new Milk(d1);
		System.out.println(m1.getDescription());
		System.out.println(m1.cost());

	}

}
