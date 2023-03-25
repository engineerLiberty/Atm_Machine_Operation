package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userAtmNumber = 123456;
        int userAtmPin = 1234;
        AtmOperationService operationService = new AtmOperationServiceImpl();
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Engineer Liberty ATM Machine");
        System.out.print("Enter ATM Number: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter ATM Pin: ");
        int atmPin = sc.nextInt();

        if (atmNumber == userAtmNumber && atmPin == userAtmPin){
            while (true){
                System.out.println("1.View Available balance\n2.Withdraw Amount" + "\n3.Deposit Amount\n4.Mini Statement\n5.Exit");
                System.out.println("Enter your Choice of Transaction: ");

                int choice = sc.nextInt();
                if (choice==1){
                    operationService.viewBalance();

                }
                else if (choice==2){
                    System.out.print("Enter Amount you want to withdraw: ");
                    double withdrawalAmount = sc.nextDouble();
                    operationService.withdrawAmount(withdrawalAmount);


                }
                else if (choice==3){
                    System.out.print("Enter Amount you want to deposit: ");
                    double depositAmount = sc.nextDouble();
                    operationService.depositAmount(depositAmount);

                }
                else if (choice==4){
                    operationService.viewBankMiniStatement();

                }
                else if (choice==5){
                    System.out.println("Collect your Atm Card\nThank you for using this machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid selection, please enter a valid selection(Choice)");
                }
            }
        }
        else {
            System.out.println("Invalid Atm Number or pin");
            System.exit(0);
        }
    }
}