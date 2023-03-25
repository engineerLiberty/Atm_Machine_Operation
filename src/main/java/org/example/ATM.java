package org.example;

public class ATM {
    private double balance;
    private double depositedAmount;
    private double withdrawAmount;

//    default constructor
    public ATM(){

    }
//    Getter and Setter method
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getDepositedAmount(){
        return depositedAmount;
    }

    public void setDepositedAmount(double depositedAmount) {
        this.depositedAmount = depositedAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
