package com.kodilla.basic_assertion;

public class PrimeChecker {

    private int count;

    public boolean isPrime(int number){

        if(number < 2){
            return false;
        }

        for(int i = 2; i < number; i++){
            if(number % 2 == 0){
                return false;
            }
        }
        return true;

        /*if(number > 1 && number%2 != 0 && number / 1 == number) {
            return true;
        }
        return false; */
    }

    public int getCount(){
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
