package SimUduck.Model;

import SimUduck.Behavior.FlyBehavior;
import SimUduck.Behavior.QuackBehavior;

public class MallardDuck extends Duck implements FlyBehavior,QuackBehavior {

	private String name = "Ã»µÕ¿À¸®";
	
	public MallardDuck() {
		super.flyBehavior = (FlyBehavior)new FlyBehavior.FlyWithWings();
		super.quackBehavior = (QuackBehavior) new QuackBehavior.Quack();
	}
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
