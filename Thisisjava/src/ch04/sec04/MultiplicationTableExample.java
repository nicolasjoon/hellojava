package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
	    for (int m=1; m<=9; m++) {
	    	// 1부터 9까지 곱해지는 수	
	        for (int n=2; n<=9; n++) { 
	        	// 2단부터 9단까지 출력
	            System.out.print(n + " x " + m + " = " + (m*n) + "\t");
	        }
	        System.out.println(); // 한 줄 출력 후 줄바꿈
	    }
	}
}