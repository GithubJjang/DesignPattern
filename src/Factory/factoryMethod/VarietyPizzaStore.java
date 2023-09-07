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
	// �� Store���� factory ������ �ϴ� create �޼ҵ带 Ư���� �°� Override�Ѵ�.
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
	// �� Store���� factory ������ �ϴ� create �޼ҵ带 Ư���� �°� Override�Ѵ�.
}