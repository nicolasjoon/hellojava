package salesforce.ex2;

public class FishBread {
	
	int price = 700;
	String name;
	
	FishBread(String name){
	 this.name = name;
	}
	FishBread(String name, int price){
	 this.name = name;	
	 this.price = price;
	}
	
	 FishBread(){
		 this("슈크림붕어빵",1000);
	 }
}


