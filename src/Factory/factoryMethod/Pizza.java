package Factory.factoryMethod;

abstract class Pizza {
	Topping topping;
	String name;
	Action1 action1;
}

class CheezePizza extends Pizza{
	
	public CheezePizza() {
		super.name="치즈피자";
		super.action1= new Action1(name);
	}
}

class GreekPizza extends Pizza{
	
	public GreekPizza() {
		super.name="그리스피자";
		super.action1= new Action1(name);
	}
}

class NYStyleCheezePizza extends Pizza{
	
	public NYStyleCheezePizza(String type) {
		super.topping = new ConcreteTopping();
		String toppingEle = topping.getTopping(type);
		super.name="NewYork "+toppingEle+"피자";
		super.action1= new Action1(name);
	}
}

class ChicagoStylePizza extends Pizza{
	
	public ChicagoStylePizza(String type) {
		super.topping = new ConcreteTopping();
		String toppingEle = topping.getTopping(type);
		super.name="Chicago "+toppingEle+"피자";
		super.action1= new Action1(name);
	}
}
