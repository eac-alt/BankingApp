package com.bae.bankingapp;

public class PrizeLogic {

    //String accountNumber = "Test string";
    //int prizeMoney = 0;

    public int genNumber(String accountNumber) {
        int prizeMoney = 0;
        String firstLetter = "" + accountNumber.charAt(0);
        int accountNumberLength = accountNumber.length();
        if (accountNumberLength != 7 && accountNumberLength != 9 && accountNumberLength != 11) {
            throw new IllegalStateException("Check accountNumber length.  Account numbers should be one letter and 6, 8, 10 digit number.");
        } else {
            switch (firstLetter) {
                case "a":
                    prizeMoney = 0;
                    break;
                case "b":
                    switch (accountNumberLength) {
                        case 7:
                            prizeMoney = 50;
                            break;
                        case 9:
                            prizeMoney = 500;
                            break;
                        case 11:
                            prizeMoney = 5000;
                            break;
                    }
                    break;
                case "c":
                    switch (accountNumberLength) {
                        case 7:
                            prizeMoney = 100;
                            break;
                        case 9:
                            prizeMoney = 750;
                            break;
                        case 11:
                            prizeMoney = 10000;
                            break;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value at start of account number: " + firstLetter + "/n account number must start with a, b, c");
            }
        }
        return prizeMoney;
    }
}
