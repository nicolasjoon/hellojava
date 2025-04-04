package ch04.sec08.practice;

public class Problem1 {
	public static void main(String[] args) {
		int sum = 0; 
		int i;
		
		for(i=1; i<=100; i++) {
		 if(1%3 == 0) {
			 if(1%3 == 0)
			sum += 1;
		  }		
		}
		
		System.out.println("1~" + (i-1) + "정수 중 3의 배수의 총합: " + sum);
	}
}

