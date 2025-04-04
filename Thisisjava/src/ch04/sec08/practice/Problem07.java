package ch04.sec08.practice;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 100 ) +1;
		System.out.println(random);
		
		Scanner sc = new Scanner(System.in);
		String inputNum = "";
		
		System.out.println("=========================");
		System.out.println(" [ 숫자 맞추기 게임 ] ");
		System.out.println("=========================");
		
		// 게임진행여부
		while(cont) {
		//게임시작
		while (true) {
			System.out.print(">>");
			inputNum = sc.nextLine();
			if(random > Integer.parseInt(inputNum)) {
				System.out.println("더 높게");
			} else if(random < Integer.parseInt(inputNum)) {
				System.out.println("더 낮게");
			} else {
			  System.out.println("맞았습니다");
			  break;  
			}
		}
		
		// 게임 계속 진행 여부 확인
		System.out.println("게임을 종료 하시겠습니까?(y/n)");
		inputNum = sc.nextLine();
		if("y".equals(inputNum) || "Y".equals(inputNum)) {
			cont = false;
	   } else {
		   cont = true;
	   }
		}
		System.out.println("=========================");
		System.out.println(" [ 숫자 맞추기 게임 종료 ] ");
		System.out.println("=========================");	


