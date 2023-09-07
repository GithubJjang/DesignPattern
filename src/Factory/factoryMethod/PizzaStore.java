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
	
	public abstract Pizza createPizza(String type);// ĸ��ȭ ����
	// �ν��Ͻ��� ����� factoryŬ������ ���� ��������, ���⼭�� �� ��ü Ư���� �°� ������ �ǵ���,
	// �޼��尡 factory ������ �Ѵ�.
}
