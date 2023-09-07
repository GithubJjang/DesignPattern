package Factory.factoryMethod;

class Main {

	public static void main(String[] args) {
		NYStylePizzaStore NYstore = new NYStylePizzaStore();
		NYstore.orderPizza("cheeze");
		System.out.println();
		NYstore.orderPizza("pepperoni");
		System.out.println("====================");
		ChicagoStylePizzaStore Chicagostore = new ChicagoStylePizzaStore();
		Chicagostore.orderPizza("cheeze");
		System.out.println();
		Chicagostore.orderPizza("pepperoni");

	}

}
