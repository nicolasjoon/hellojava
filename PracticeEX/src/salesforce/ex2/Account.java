package salesforce.ex2;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    
    private String accountNum;
    private String accountOwner;
    private int balance;

    public Account(String accountNum, String accountOwner, int balance) {
        this.accountNum = accountNum;
        this.accountOwner = accountOwner;
        setBalance(balance);  // 초기 잔액 설정 (유효성 검사 포함)
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        } else {
            System.out.println("잔액은 " + MIN_BALANCE + "원 이상, " + MAX_BALANCE + "원 이하여야 합니다.");
        }
    }

    public void deposit(int amount) {
        if (amount > 0 && (balance + amount) <= MAX_BALANCE) {
            balance += amount;
        } else {
            System.out.println("입금할 수 없는 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족하거나 출금할 수 없는 금액입니다.");
        }
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNum + ", 예금주: " + accountOwner + ", 잔액: " + balance;
    }
}
