package main.staticKeyword.staticVariable;

public class BankDemo {
    public static void main(String[] args) {
        BankAcc vamsi = new BankAcc();
        BankAcc mounica = new BankAcc();
        System.out.println(BankAcc.getBalance()); // 1000

        vamsi.save(100);
        System.out.println(BankAcc.getBalance()); //1100
        mounica.spend(200);
        System.out.println(BankAcc.getBalance()); //900
    }
}
