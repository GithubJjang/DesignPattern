package SimUduck.Behavior;

public interface QuackBehavior {
	
	public void quack();
	
	public class Quack implements QuackBehavior{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
			System.out.println("�в�");
		}
		
	}
	
	public class Squeak implements QuackBehavior{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
			System.out.println("���");
		}
		
	}
	
	public class MuteQuack implements QuackBehavior{

		@Override
		public void quack() {
			// TODO Auto-generated method stub
			System.out.println("����~");
		}
		
	}
}
