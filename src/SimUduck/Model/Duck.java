package SimUduck.Model;

import SimUduck.Behavior.FlyBehavior;
import SimUduck.Behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
		
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("������ ���� �� �� �ִ�.");
	}

	public abstract void display();

}
