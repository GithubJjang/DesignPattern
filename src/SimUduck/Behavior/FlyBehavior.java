package SimUduck.Behavior;

public interface FlyBehavior {// Fly�� ���� ��� ����� �����Ѵ�.
	public void fly();// abstract
	
	// ���� Ŭ������ FlyBehavior�� �����ϴ� ���� -> Ȯ�强�� ���
	public class FlyWithWings implements FlyBehavior{
		// fly(), FlyNoWay ��밡��
		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("�� �� �־�!!!");
		}
		
	}
	
	public class FlyNoWay implements FlyBehavior{
		// fly(), FlyWithWings ��밡��
		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("�� �� ����!!!");
		}
		
	}

}
