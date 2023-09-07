package Factory.factoryMethod;

import java.util.ArrayList;

abstract class Topping {
	ArrayList<String> toppings;
	public abstract String getTopping(String type);
}

class ConcreteTopping extends Topping{
	public ConcreteTopping () {
		super.toppings = new ArrayList<String>();
		toppings.add("cheeze");
		toppings.add("pepperoni");
		toppings.add("clam");
		toppings.add("veggie");
	}
	
	public String getTopping(String type) {
		for(String s:toppings) {
			if(type.equals(s)) {
				return s;
			}
		}
		return null;
	}
	
	
}
