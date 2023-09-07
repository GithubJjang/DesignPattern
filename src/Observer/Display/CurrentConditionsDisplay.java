package Observer.Display;

import Observer.Model.WeatherData;
import Observer.guideLine.DisplayElement;
import Observer.guideLine.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	
	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("�������: �µ�: "+temperature+"F/ ����: "+humidity+"% ");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.humidity=humidity;
		this.temperature=temperature;
		display();
		
	}
	

}
