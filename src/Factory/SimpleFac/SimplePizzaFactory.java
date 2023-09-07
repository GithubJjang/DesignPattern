package Factory.SimpleFac;

class SimplePizzaFactory {
	
	public SimplePizzaFactory() {
		
	}
	
	public Pizza createPizza(String type) {
		switch (type){
		case "cheeze": {
			return new CheezePizza();
		}
		case "greek":{
			return new GreekPizza();
		}
		default:
			return null;
		}
	}

}
