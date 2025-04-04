package ch04.sec08.practice;

import java.util.Scanner;

public class Problem6 {
	
    public static void main(String[] args) {
    	System.out.println("숫자를 입력하세요");
    	
        Scanner sc= new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num = sc.nextInt();
        int sum = 0;
        
        if (num % 2 == 0) {
        	for (int i = 0; i <= num; i += 2) {
                sum += i;
        }     
      }
        else {
            for (int i = 1; i <= num; i += 2) {
                sum += i;
            }
       }
        System.out.println("결과값: " + sum);
        
        sc.close();
    }
}
    
// 아래쪽으로 10번

// 중첩된 for 문을 어떻게 제어할 것인가 

//입력 받은 숫자가 홀수인 경우에는 입력 값까지 홀수의 합을 출력합니다
//입력 받은 숫자가 짝수인 경우에는 입력 값까지 짝수의 합을 출력합니다
//-------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
}