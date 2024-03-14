package oop;

public class Question2 {

    static class Account {

        int balance;

        Account(int balance) {
            this.balance = balance;
        }

        void deposit(int amount) {

            balance += amount;
            System.out.println("입급을 완료했습니다.");
            System.out.println("입급 : " + amount);
            System.out.println("잔고 : " + balance);
        }

        void withdraw(int amount) {

            if (balance - amount < 0) {
                System.out.println("잔액이 부족합니다.");
                System.out.println("잔고 : " + balance);
                System.out.println("출금 : " + amount);
            } else {
                balance -= amount;
                System.out.println("출금이 완료됐습니다.");
                System.out.println("출금 : " + amount);
                System.out.println("잔고 : " + balance);
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account(0);

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
    }
}
