package Decorator.ConcreteComponent;

import Decorator.Beverage.Beverage;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		super.description="��û���� ���� ��ũ�ν�Ʈ Ŀ��";
	}

	@Override
	public double cost() {
		return 1500;
	}

}
