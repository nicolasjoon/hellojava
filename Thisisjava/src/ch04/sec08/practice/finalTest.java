package ch04.sec08.practice;

import java.util.Scanner;

public class finalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean game = true;

        while (game) {
            int i = (int) (Math.random() * 100) + 1;
            int j = 0;

            System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");

            while (j != i) {
                System.out.print("숫자를 입력하세요: ");

                if (scanner.hasNextInt()) {
                    j = scanner.nextInt();

                    if (j > i) {
                        System.out.println("더 낮게");
                    } else if (j < i) {
                        System.out.println("더 높게");
                    } else {
                        System.out.println("맞았습니다!");
                    }
                } else {
                    System.out.println("올바른 숫자를 입력하세요.");
                    scanner.next();
                }
            }

            System.out.print("다시 하시겠습니까? (y/n): ");
            String response = scanner.next();
            game = response.equalsIgnoreCase("y");
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}