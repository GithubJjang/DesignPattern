package Factory.factoryMethod;

public abstract class PizzaAction{
	String name;
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
}

class Action1 extends PizzaAction{
	
	public Action1(String name) {// String name <-> Pizza pizza(���氡�� ȭ��ǥ)
		super.name = name;
	}

	@Override
	public void prepare() {
		System.out.println(name+"�� �غ��� �Դϴ�.");
		
	}

	@Override
	public void bake() {
		System.out.println(name+"��/�� ������ �Դϴ�.");
		
	}

	@Override
	public void cut() {
		System.out.println(name+"��/�� �ڸ����� �Դϴ�.");
		
	}

	@Override
	public void box() {
		System.out.println(name+"��/�� �������Դϴ�.");
		
	}
	
}
