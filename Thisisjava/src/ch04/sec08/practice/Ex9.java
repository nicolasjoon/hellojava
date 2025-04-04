package ch04.sec08.practice;

public class Ex9 {
	
  public static void main(String[] args) {
	  System.out.println("숫자를 입력하세요");
	  Scanner sc = new Scanner(System.in);
	  for(int i = 1; i <= 7; i++) {
		  
		  for(int j = 0; j<=i; j++) {
			  //System.out.print(j + " ");
			  System.out.print(i);
		  }
		  System.out.print("\n");
	  }
	  
  }
}