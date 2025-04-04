package ch04.sec08.practice;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;		
		int account = 0;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			
			int meunNum = Integer.parseInt(scanner.nextLine());
			
            switch (meunNum) {
            case 1:
                System.out.print("예금액>");
                //account	+= Integer.parseInt(scanner.nextLine());
                account = account + Integer.parseInt(scanner.nextLine());
                break;
            case 2:
                System.out.print("출금액>");
                //account	-= Integer.parseInt(scanner.nextLine());
                account = account - Integer.parseInt(scanner.nextLine());
                break;
            case 3:
                System.out.println("잔고>");
                System.out.println(account);
                break;
            case 4:
            	run = false;
            	break;
            }
            System.out.println();
		}	
		
		System.out.println("프로그램 종료");
	}
}