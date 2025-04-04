package salesforce.ex2;

public class HoBreadEX {

	int price = 500;
	String name;
	
	HoBreadEX(String name){
	 this.name = name;
	}
	
	HoBreadEX(String name, int price){
	 this.name = name;	
	 this.price = price;

	 }
}


//오버로딩