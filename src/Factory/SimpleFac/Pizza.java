package Factory.SimpleFac;

abstract class Pizza {
	String name;
	Action1 action1;
}

class CheezePizza extends Pizza{
	
	public CheezePizza() {
		super.name="ġ������";
		super.action1= new Action1(name);
	}
}

class GreekPizza extends Pizza{
	
	public GreekPizza() {
		super.name="�׸�������";
		super.action1= new Action1(name);
	}
}
