package ch04.sec08.practice;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
    	
    	System.out.println("숫자를 입력하세요");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             Scanner scanner = new Scanner(System.in);
        int max = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("숫자: ");
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("최대값은 " + max + "입니다.");
        scanner.close();
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                     