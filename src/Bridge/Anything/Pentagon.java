package Bridge.Anything;

import Bridge.Abstract.Shape;
import Bridge.Implement.Color;

public class Pentagon extends Shape {

	public Pentagon(Color color) {
		super.setColor(color);
	}
	
	@Override
	public void applyColor() {
		System.out.println("Pentagon filled with color ");
		color.applyColor();
	}

}
