package Factory.factoryMethod;

public abstract class PizzaAction{
	String name;
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
}

class Action1 extends PizzaAction{
	
	public Action1(String name) {// String name <-> Pizza pizza(변경가능 화살표)
		super.name = name;
	}

	@Override
	public void prepare() {
		System.out.println(name+"가 준비중 입니다.");
		
	}

	@Override
	public void bake() {
		System.out.println(name+"를/을 굽는중 입니다.");
		
	}

	@Override
	public void cut() {
		System.out.println(name+"를/을 자르는중 입니다.");
		
	}

	@Override
	public void box() {
		System.out.println(name+"를/을 포장중입니다.");
		
	}
	
}
