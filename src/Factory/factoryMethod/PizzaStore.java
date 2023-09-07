package Factory.factoryMethod;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza = createPizza(type);
		pizza.action1.prepare();
		pizza.action1.bake();
		pizza.action1.cut();
		pizza.action1.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);// 캡슐화 상태
	// 인스턴스를 만드는 factory클래스를 따로 빼놨지만, 여기서는 각 객체 특성에 맞게 생성이 되도록,
	// 메서드가 factory 역할을 한다.
}
