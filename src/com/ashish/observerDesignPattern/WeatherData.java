package com.ashish.observerDesignPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(0);
		
		if (i >= 0) {
			observers.remove(i);
		}

	}

	@Override
	public void nofityObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}

	}
	
	public void measurementsChanges() {
		nofityObserver();
	}
	
	public void setMeasuremets(float temerature, float humidity, float pressure) {
		this.temperature = temerature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanges();
	}

}
