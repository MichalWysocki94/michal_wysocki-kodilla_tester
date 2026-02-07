package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine cashMachine_1 = new CashMachine();
    CashMachine cashMachine_2 = new CashMachine();
    CashMachine cashMachine_3 = new CashMachine();
    Bank bank = new Bank();

    @BeforeEach
    public void setup(){
        cashMachine_1.add(100);
        cashMachine_1.add(-1200);
        cashMachine_1.add(300);

        cashMachine_2.add(2000);
        cashMachine_2.add(-500);
        cashMachine_2.add(-1100);

        cashMachine_3.add(-400);
        cashMachine_3.add(-250);

        bank.addCashMachine(cashMachine_1);
        bank.addCashMachine(cashMachine_2);
        bank.addCashMachine(cashMachine_3);
    }


    @Test
    public void showTotalBalanceFromEveryCashmachine(){

        int allMoney = bank.getTotalBalance();
        assertEquals(-1050, allMoney);
    }

    @Test
    public void showTotalWithdrawCountFromEveryCashmachine(){
        //given
        //when
        int allWithdraws = bank.getTotalWithdrawCount();
        //then
        assertEquals(5,allWithdraws);


    }

    @Test
    public void showTotalDepositCountFromEveryCashmachine(){
        //given
        //when
        int allDepo = bank.getTotalDepositCount();
        //then
        assertEquals(3, allDepo);
    }

    @Test
    public void showAverageValueOfDepositFromAllCashmachines(){
        //given
        //when
        int averegeDeposit = bank.getTotalAverageDeposit();
        //then
        assertEquals(800, averegeDeposit);
    }

    @Test
    public void showAverageValueOfWithdrawsFromAllCashmachines(){
        //given
        //when]
        int averageWithdraw = bank.getTotalAverageWithdraw();
        //then
        assertEquals(690, averageWithdraw);
    }

}