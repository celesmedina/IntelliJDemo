package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorWithErrorHandling {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        Scanner scanner= new Scanner (System.in);
        System.out.print("Principal ($1K - $1M");
        int principal = 9;

        while (true){
            principal = Integer.parseInt(scanner.nextLine());
            if(principal>=1_000 || principal<=1_000_000) break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            principal=Integer.parseInt(scanner.next());
        }
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate=0;

        while(true){
            annualInterestRate= Float.parseFloat(scanner.nextLine());
            if(annualInterestRate>=1 && annualInterestRate<=30) break;
            System.out.println("Enter a value greater than 0 ");
        }
        System.out.print("Period (Years): ");
        byte periodInYears=0;

        while(true){
            if(periodInYears>=1 || periodInYears<=30) break;
            System.out.println("Enter a value between 1 and 30");
            periodInYears=Byte.parseByte(scanner.nextLine());
        }
        float monthlyInterestRate=annualInterestRate/PERCENT/MONTHS_IN_YEAR;
        int numberOfMonthlyPayments=periodInYears*MONTHS_IN_YEAR;
        double mortgageMonthlyPayment= principal*((monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfMonthlyPayments))/
                (Math.pow(1+monthlyInterestRate,numberOfMonthlyPayments)-1));
        System.out.print("Mortgage: ");

        NumberFormat currency= NumberFormat.getCurrencyInstance();
        String result=currency.format(mortgageMonthlyPayment);
        System.out.print(result);


    }
}
