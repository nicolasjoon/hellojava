package salesforce.ex2;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[100];
    private static int accountCount = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("========================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("========================================");
            System.out.print("선택> ");
            String select = sc.nextLine();

            switch (select) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountsList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    run = false;
                    System.out.println("프로그램 종료.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("계좌번호 입력: ");
        String accountNum = sc.nextLine();
        System.out.print("예금주 입력: ");
        String accountOwner = sc.nextLine();
        System.out.print("초기 입금액 입력: ");
        int balance = Integer.parseInt(sc.nextLine());

        accounts[accountCount++] = new Account(accountNum, accountOwner, balance);
        System.out.println("계좌가 성공적으로 생성되었습니다.");
    }

    private static void accountsList() {
        System.out.println("계좌 목록:");
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
        }
    }

    private static void deposit() {
        System.out.print("입금할 계좌번호: ");
        String accountNum = sc.nextLine();
        Account account = findAccount(accountNum);

        if (account != null) {
            System.out.print("입금액: ");
            int amount = Integer.parseInt(sc.nextLine());
            account.deposit(amount);
            System.out.println("입금 완료! 현재 잔액: " + account.getBalance());
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static void withdraw() {
        System.out.print("출금할 계좌번호: ");
        String accountNum = sc.nextLine();
        Account account = findAccount(accountNum);

        if (account != null) {
            System.out.print("출금액: ");
            int amount = Integer.parseInt(sc.nextLine());
            account.withdraw(amount);
            System.out.println("출금 완료! 현재 잔액: " + account.getBalance());
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static Account findAccount(String accountNum) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNum().equals(accountNum)) {
                return accounts[i];
            }
        }
        return null;
    }
}
				 

				 