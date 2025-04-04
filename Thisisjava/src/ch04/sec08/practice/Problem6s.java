package ch04.sec08.practice;

import java.util.Scanner;

public class Problem6s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		if (num % 2 == 0) {
			for (int i = 0; i <= num; i += 2) {
				sum += 1;
			}
		} else {
			for (int i = 1; i <= num; i += 2) {
				sum += i;
			}
		}
	}
}
