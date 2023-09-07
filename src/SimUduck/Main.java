package SimUduck;

import SimUduck.Model.Duck;
import SimUduck.Model.MallardDuck;
import SimUduck.Model.RedheadDuck;
import SimUduck.Model.RubberDuck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Duck rubDuck = new RubberDuck();
		rubDuck.display();
		rubDuck.performFly();
		rubDuck.performQuack();
		System.out.println();
		
		Duck malDuck = new MallardDuck();
		malDuck.display();
		malDuck.performFly();
		malDuck.performQuack();
		System.out.println();
		
		Duck redDuck= new RedheadDuck();
		redDuck.display();
		redDuck.performFly();
		redDuck.performQuack();
		
		
	}

}
