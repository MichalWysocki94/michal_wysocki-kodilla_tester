package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet(){

    }

    public void deposit(int money) {

        if (money < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }

        this.balance += money;
    }

    public void debit(int money) {

        if (money <= 0) {
            throw new IllegalArgumentException("Debit amount must be positive");
        }

        if (balance < money) {
            throw new IllegalArgumentException("Not enough money in wallet");
        }

        this.balance -= money;
    }

//    public void debit(int money) {
//        this.balance -= money;
//    }
//
//    public void deposit(int money){
//        this.balance += money;
//    }

    public int getBalance(){
        return balance;
    }
}
