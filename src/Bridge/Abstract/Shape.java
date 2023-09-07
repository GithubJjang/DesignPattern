package Bridge.Abstract;

import Bridge.Implement.Color;

public abstract class Shape {
	protected Color color;// Color�� �� ���� ����.

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void applyColor();
	
}
