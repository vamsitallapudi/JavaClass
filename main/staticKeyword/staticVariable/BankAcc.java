package main.staticKeyword.staticVariable;

public class BankAcc {
    private static int balance = 1000;

    public int spend(int spendAmount) {
        return balance -= spendAmount;
    }

    public int save(int saveAmount) {
        return balance += saveAmount;
    }


    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        BankAcc.balance = balance;
    }
}
