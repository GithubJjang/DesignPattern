package Bridge.Anything;

import Bridge.Abstract.Shape;
import Bridge.Implement.Color;

public class Triangle extends Shape {
	
	public Triangle(Color color) {
		super.setColor(color);// Triangle에 Color를 추가한다.
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle filled with color ");
		color.applyColor();
	}

}
