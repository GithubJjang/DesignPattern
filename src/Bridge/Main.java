package Bridge;

import Bridge.Abstract.Shape;
import Bridge.Anything.GreenColor;
import Bridge.Anything.Pentagon;
import Bridge.Anything.RedColor;
import Bridge.Anything.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());// ��ĳ������ ���ؼ� ȣȯ���� Ȯ���Ѵ�.
		triangle.applyColor();
		System.out.println();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}

}
