package org.example;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationServiceImpl implements AtmOperationService{
    ATM atm = new ATM();

    Map<Double,String> miniStmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is: "+ atm.getBalance());
    }

    @Override
    public void viewBankMiniStatement() {
        for (Map.Entry<Double,String>m: miniStmt.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
//        System.out.println(miniStmt);

    }

    @Override
    public void depositAmount(double depositAmount) {

        System.out.println(depositAmount + " Deposited successfully");
        miniStmt.put(depositAmount,"deposited");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

        System.out.println(withdrawAmount + " Withdrawn successfully\nPlease collect your cash");
        if (withdrawAmount <= atm.getBalance()) {
            miniStmt.put(withdrawAmount,"withdraw");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }
        else {
            System.out.println("You have an Insufficient balance\nCurrent balance is: " + atm.getBalance());
        }
    }
}
