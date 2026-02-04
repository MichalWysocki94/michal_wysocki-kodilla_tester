package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int value){
        if(value % 10 != 0){
            return;
        }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions(){

        return transactions;
    }


    public int getSum(){
        int sum = 0;
        if(this.transactions.length == 0){
            return 0;
        }
        for (int i = 0; i < this.transactions.length; i++){
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getWithdrawCount(){

        int counter = 0;
        for(int i = 0; i < this.transactions.length; i++){

            if(transactions[i] < 0){
                counter++;
            }
        }
        return counter;
    }

    public int getDepositCount(){
        int counter = 0;
        for(int i = 0; i < this.transactions.length; i++){

            if (transactions[i] > 0){
                counter++;
            }
        }
        return counter;
    }

    public int getAverageWithdraw(){
        int withdrawCount = getWithdrawCount();
        if (withdrawCount == 0) {
            return 0;
        }

        int sum = 0;
        for(int i = 0; i < this.transactions.length; i++){

            if (transactions[i] < 0){
                sum += transactions[i];
            }
        }
        return sum / withdrawCount * -1;
    }

    public int getAverageDeposit(){
        int depositCount = getDepositCount();
        if(depositCount == 0){
            return 0;
        }

        int sum = 0;
        for(int i = 0; i <this.transactions.length; i++){

            if (transactions[i] > 0){
                sum += transactions[i];
            }
        }
        return sum / depositCount;
    }


}
//[transakcja1(-1500), transakcja2(400), transakcja3(300)]
// int negativeValue = transaction[i] < 0





/*
    public int sumtransactions(){
        int sum;
        for(int i = 0; i < transactions.length; i++){
            sum += transactions[i];
        } return sum;
    }

    public int countTransaction(){
        return transactions.length;
    }

    public int addTransaction(int value){
        this.size++;
        transactions[size] = value;
        return transactions;
    }



    potrzebuje tablicy transakcjeBankomatu- int[transakcja1(-1500), transakcja2(400), transakcja3(300)]

    metoda zwracająca saldo bankomatu

    metoda wykonanych transakcji - jeśli


     */





