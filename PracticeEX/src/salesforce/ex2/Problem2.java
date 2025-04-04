package salesforce.ex2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg = 0.0;
		int[] num = new int [5];
		int sum = 0;
		
		for(int i = 0; i<num.length; i++) {
			num[1] = sc.nextInt();
			sum += num[i];
		}
		avg = sum / 5.0;
		System.out.println(avg);
	}
}

//5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성


