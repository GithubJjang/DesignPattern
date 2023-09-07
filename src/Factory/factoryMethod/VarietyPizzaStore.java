package Factory.factoryMethod;

class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
		case "cheeze": {
			return new NYStyleCheezePizza(type);
		}
		case "pepperoni":{
			//return new NYStylePepperoniPizza();
			return new NYStyleCheezePizza(type);
		}
		case "clam":{
			//return new NYStyleClamPizza();
			return new NYStyleCheezePizza(type);
		}
		case "veggie":{
			//return new NYStyleVeggiePizza();
			return new NYStyleCheezePizza(type);
		}
		default:{
			return null;
		}
	}
		
	}
	// 각 Store마다 factory 역할을 하는 create 메소드를 특성에 맞게 Override한다.
}

class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
		case "cheeze": {
			return new ChicagoStylePizza(type);
		}
		case "pepperoni":{
			//return new NYStylePepperoniPizza();
			return new ChicagoStylePizza(type);
		}
		case "clam":{
			//return new NYStyleClamPizza();
			return new ChicagoStylePizza(type);
		}
		case "veggie":{
			//return new NYStyleVeggiePizza();
			return new ChicagoStylePizza(type);
		}
		default:{
			return null;
		}
	}
		
	}
	// 각 Store마다 factory 역할을 하는 create 메소드를 특성에 맞게 Override한다.
}