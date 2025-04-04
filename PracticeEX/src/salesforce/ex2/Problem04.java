package salesforce.ex2;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		int[] cash = {50000,10000,5000,1000,500,100,50,10,5,1};

		Scanner sc = new Scanner(System.in);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                	System.out.println("금액: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < cash.length; i++) {
			int count = num / cash[i];
			if(count > 0) {
				System.out.println(cash[i] + "원: " + count + "개");
			}
	num %= cash[i];	
	 }
 }
} 
		
		
		
//키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 5원동전, 1원동전 각 몇개로 변환되는지 작성하세요.

