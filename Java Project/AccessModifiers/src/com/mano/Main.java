package com.mano;

public class Main {

    public static void main(String[] args) {
        Account manosAccount = new Account("Mano");
        manosAccount.deposit(1000);
        manosAccount.withdraw(500);
        manosAccount.withdraw(-200);
        manosAccount.deposit(-20);
        manosAccount.calculatedBalance();
        manosAccount.balance = 5000;

        System.out.println("Balance on account is " + manosAccount.getBalance());
        manosAccount.transactions.add(4500);
        manosAccount.calculatedBalance();
    }
}
