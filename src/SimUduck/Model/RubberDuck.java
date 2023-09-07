package SimUduck.Model;

import SimUduck.Behavior.FlyBehavior;
import SimUduck.Behavior.QuackBehavior;

public class RubberDuck extends Duck implements FlyBehavior,QuackBehavior {
	private String name = "고무오리";
	
	public RubberDuck() {
		super.flyBehavior = (FlyBehavior) new FlyBehavior.FlyNoWay();
		super.quackBehavior = (QuackBehavior) new QuackBehavior.Squeak();
	}
	
	/*  
	  	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior)
		}
		
		RubberDuck((FlyBehavior)new FlyBehavior.FlyNoWay(), (QuackBehavior)new QuackBehavior.MuteQuack());
		이런식으로 두개의 생성된 객체를 직접 파라미터를 사용해서 넣어줘도 되나, 코드가 너무 복잡하고 지저분해진다.
		그래서 RubberDuck을 생성하자 마자 두개의 동작 인스턴스도 생성을 한다. 
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
