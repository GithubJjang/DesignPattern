package Factory.SimpleFac;

abstract class Pizza {
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
