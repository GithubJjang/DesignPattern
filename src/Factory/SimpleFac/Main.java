package Factory.SimpleFac;

class Main {
	public static void main(String arsg[]) {
		PizzaStore pizzaStore = new PizzaStore();
		
		Pizza pizza = pizzaStore.orderPizza("cheeze");
		System.out.println(pizza.name);
		System.out.println();
		
		Pizza pizza2 = pizzaStore.orderPizza("greek");
		System.out.println(pizza2.name);
	}
}
