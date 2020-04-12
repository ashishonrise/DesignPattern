package com.ashish.factoryDesignPattern;

public class Client {
	
	 View tempView;
	public Client(int count){
		
		switch (count) {
		case 0:
			tempView = new TextView();
			break;
		case 1:
			tempView = new ListView();
			break;

		case 2:
			tempView = new MapView();
			break;

		default:
			break;
		}
	}
	
	
	public View getTempView(){
		return tempView;
	}
	
	
	public static void main(String[] args) {
		Client client = new Client(1);
		View v = client.getTempView();
		v.getView();
	}

}
