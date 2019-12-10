package com.bae.bankingapp;

public class PrizeLogic {

    //String accountNumber = "Test string";
    //int prizeMoney = 0;

    public int genNumber(String accountNumber) {
        int prizeMoney = 0;
        String firstLetter = "" + accountNumber.charAt(0);
        switch (firstLetter) {
            case "a":
                prizeMoney = 0;
                break;
            case "b":
                switch (accountNumber.length()) {
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
                switch (accountNumber.length()) {
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
        }
        return prizeMoney;
    }
}
