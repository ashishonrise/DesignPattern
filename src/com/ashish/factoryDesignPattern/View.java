package com.ashish.factoryDesignPattern;

public class View {
	
	void getView(){
		System.out.println("View");
	}

}


 class TextView extends View{
	 void getView(){
			System.out.println("TextView");
		}
}
 
 class ListView extends View{
	 void getView(){
			System.out.println("ListView");
		}
}
 
 class MapView extends View{
	 void getView(){
			System.out.println("MapView");
		}
}
 
 
 
