package Factory.SimpleFac;

public class PizzaStore {
	
	private SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore() {
		simplePizzaFactory = new SimplePizzaFactory();
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);
		pizza.action1.prepare();
		pizza.action1.bake();
		pizza.action1.cut();
		pizza.action1.bake();
		
		return pizza;
	}
}
