package SimUduck.Behavior;

public interface QuackBehavior {
	
	public void quack();
	
	public class Quack implements QuackBehavior{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
			System.out.println("²Ð²Ð");
		}
		
	}
	
	public class Squeak implements QuackBehavior{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
			System.out.println("»à»à");
		}
		
	}
	
	public class MuteQuack implements QuackBehavior{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
			System.out.println("Á¶¿ë~");
		}
		
	}
}
