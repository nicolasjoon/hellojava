package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		
		int i = 1;
		
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println(i + " ");
		
		for(i=1; i<=10; 1++) {
			System.out.print(i + " ");
		}
	}
}
