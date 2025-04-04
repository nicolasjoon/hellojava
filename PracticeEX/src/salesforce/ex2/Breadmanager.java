package salesforce.ex2;

public class Breadmanager {

	public static void main(String[] args) {
		                                                                                                                                                                                                                                                                                          
		FishBread[] fb = new FishBread[2];
		for(int i=0; i<fb.length; i++) {
			fb[0] = new FishBread("팥붕어빵", 700);	      
			fb[1] = new FishBread("크림붕어빵", 1000);	
				
		HoBread[] hb = new HoBread[2];
		for(int j=0; j<hb.length; j++) {
			hb[0] = new HoBread("호떡",700);	
			hb[1]= new HoBread("씨앗호떡",900);			
			
	        int fbPrice = fb.length * fb[0].price;
	        int hbPrice = hb.length * hb[0].price;

	        int total = fbPrice + hbPrice;

	        // Printing the results
	        System.out.println("팥붕어빵 " + fb.length + "개");
	        System.out.println("크림붕어빵 " + fb.length + "개");
	        System.out.println("호떡 " + hb.length + "개");
	        System.out.println("씨앗호떡 " + hb.length + "개");
	        System.out.println("총 금액: " + total);
	    }
	}
		}
	}

