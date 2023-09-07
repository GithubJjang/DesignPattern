package SimUduck.Model;

import SimUduck.Behavior.FlyBehavior;
import SimUduck.Behavior.QuackBehavior;

public class RubberDuck extends Duck implements FlyBehavior,QuackBehavior {
	private String name = "������";
	
	public RubberDuck() {
		super.flyBehavior = (FlyBehavior) new FlyBehavior.FlyNoWay();
		super.quackBehavior = (QuackBehavior) new QuackBehavior.Squeak();
	}
	
	/*  
	  	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior)
		}
		
		RubberDuck((FlyBehavior)new FlyBehavior.FlyNoWay(), (QuackBehavior)new QuackBehavior.MuteQuack());
		�̷������� �ΰ��� ������ ��ü�� ���� �Ķ���͸� ����ؼ� �־��൵ �ǳ�, �ڵ尡 �ʹ� �����ϰ� ������������.
		�׷��� RubberDuck�� �������� ���� �ΰ��� ���� �ν��Ͻ��� ������ �Ѵ�. 
	 */
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {

		return this.name;
	}
	
	

}
