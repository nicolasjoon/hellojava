package salesforce.ex2;

public class BreadmanagerEX {

	public static void main(String[] args) {
		                                                                                                                                                                                                                                                                                          
		FishBread[] fb = new FishBread[3];
			fb[0] = new FishBread("붕어빵");	      
			fb[1] = new FishBread("붕어빵");	
			fb[2] = new FishBread("붕어빵");	
				
		HoBread[] hb = new HoBread[5];
		for(int j=0; j<hb.length; j++) {
			hb[1]= new HoBread("호떡");			
			
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

