package salesforce.ex2;

public class HoBread {

	int price = 700;
	String name;
	
	HoBread(String name){
	 this.name = name;
	}
	HoBread(String name, int price){
	 this.name = name;	
	 this.price = price;
	}
	
	 HoBread(){
		 this("씨앗호떡",900);
	 }
}


