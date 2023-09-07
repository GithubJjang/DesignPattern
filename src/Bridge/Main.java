package Bridge;

import Bridge.Abstract.Shape;
import Bridge.Anything.GreenColor;
import Bridge.Anything.Pentagon;
import Bridge.Anything.RedColor;
import Bridge.Anything.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());// 업캐스팅을 통해서 호환성을 확보한다.
		triangle.applyColor();
		System.out.println();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}

}
