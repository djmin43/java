package org.example.oop1;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account();

        account.balance = 10;
        account.deposit(30);

        System.out.println("account = " + account.balance);

        account.withdraw(90);

        account.withdraw(10);
        
        System.out.println("account = " + account.balance);

    }
}
