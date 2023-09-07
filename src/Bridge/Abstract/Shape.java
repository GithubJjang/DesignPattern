package Bridge.Abstract;

import Bridge.Implement.Color;

public abstract class Shape {
	protected Color color;// Color가 들어갈 공간 생성.

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void applyColor();
	
}
