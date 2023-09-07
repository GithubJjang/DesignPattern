package SimUduck.Behavior;

public interface FlyBehavior {// Fly에 대한 모든 기능을 포함한다.
	public void fly();// abstract
	
	// 내부 클래스가 FlyBehavior을 구현하는 이유 -> 확장성을 고려
	public class FlyWithWings implements FlyBehavior{
		// fly(), FlyNoWay 사용가능
		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("날 수 있어!!!");
		}
		
	}
	
	public class FlyNoWay implements FlyBehavior{
		// fly(), FlyWithWings 사용가능
		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("날 수 없어!!!");
		}
		
	}

}
