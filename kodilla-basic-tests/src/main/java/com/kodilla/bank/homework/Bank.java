package com.kodilla.bank.homework;

public class Bank {


    private CashMachine[] cashMachines = new CashMachine[10];
    private int size = 0;

    public void addCashMachine(CashMachine cashMachine){
        cashMachines[size] = cashMachine;
        size++;
    }




    public int getTotalBalance(){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += cashMachines[i].getSum();
        }
        return sum;
    }

    public int getTotalWithdrawCount(){
        int counter = 0;
        for(int i = 0; i < size; i++){
            counter += cashMachines[i].getWithdrawCount();
        }
        return counter;
    }

    public int getTotalDepositCount(){
        int counter = 0;
        for (int i = 0; i < size; i++){
            counter += cashMachines[i].getDepositCount();
        }
        return counter;
    }

    public int getTotalAverageWithdraw(){
        int totalCount = getTotalWithdrawCount();
        if (totalCount == 0){
            return 0;
        }
        int totalSum = 0;
        for (int i = 0; i < size; i++){
            totalSum += cashMachines[i].getAverageWithdraw() * cashMachines[i].getWithdrawCount();
        }
        return totalSum / totalCount;

    }

    public int getTotalAverageDeposit(){
        int totalCount = getTotalDepositCount();
        if (totalCount == 0){
            return 0;
        }
        int totalSum = 0;
        for (int i = 0; i < size; i++){
            totalSum += cashMachines[i].getAverageDeposit() * cashMachines[i].getDepositCount();
        }
        return totalSum / totalCount;
    }

}

/*
  CashMachine cashMachine_one = new CashMachine();
    CashMachine cashMachine_two = new CashMachine();
    CashMachine cashMachine_three = new CashMachine();
    CashMachine cashMachine_four = new CashMachine();

    CashMachine[] cashMachines = {cashMachine_one, cashMachine_two, cashMachine_three, cashMachine_four};

    public getDepositCount(){

    }

    public getWithdrawCount(){

    }

    getDepositAverage(){

    }

    getWithdrawAverage(){

    }

 */