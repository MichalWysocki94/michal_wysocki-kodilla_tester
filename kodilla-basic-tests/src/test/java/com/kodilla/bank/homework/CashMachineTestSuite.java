package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldShowCountOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(4000);
        cashMachine.add(-5001);
        cashMachine.add(25);
        cashMachine.add(-13);
        cashMachine.add(-120);


        int[] values = cashMachine.getTransactions();
        assertEquals(2, values.length);
    }


    @Test
    public void shouldShowSumTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(6000);
        cashMachine.add(-100);
        cashMachine.add(200);
        cashMachine.add(-2000);


        int sumTransactions = cashMachine.getSum();
        assertEquals(4100, sumTransactions);
    }

    @Test
    public void shouldNotAddValue() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2004);

        int sumTransactions = cashMachine.getSum();
        assertEquals(0,sumTransactions);
    }

    @Test
    public void shouldShowNumberOfWithdraws(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2500);
        cashMachine.add(-300);
        cashMachine.add(2010);
        cashMachine.add(-3000);
        cashMachine.add(-2010);
        cashMachine.add(-300);


        assertEquals(4,cashMachine.getWithdrawCount());
    }

    @Test
    public void shouldShowNumberOfDeposits(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2500);
        cashMachine.add(-300);
        cashMachine.add(2010);
        cashMachine.add(-3000);
        cashMachine.add(-2010);
        cashMachine.add(-300);


        assertEquals(2,cashMachine.getDepositCount());
    }

    @Test
    public void shouldShowAverageValueOfDeposit(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2500);
        cashMachine.add(-300);
        cashMachine.add(2010);
        cashMachine.add(-3000);
        cashMachine.add(-2010);
        cashMachine.add(300);

        assertEquals(1603, cashMachine.getAverageDeposit(), 0.1);
    }

    @Test
    public void shouldShowAverageValueOfWithdraw(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2500);
        cashMachine.add(-300);
        cashMachine.add(2010);
        cashMachine.add(-3000);
        cashMachine.add(-2010);
        cashMachine.add(300);

        assertEquals(1770, cashMachine.getAverageWithdraw(), 0.1);
    }


}
