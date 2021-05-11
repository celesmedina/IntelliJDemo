package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
	 Scanner scanner= new Scanner (System.in);
	 System.out.print("Principal: ");
     int principal =Integer.parseInt( scanner.nextLine());
     System.out.print("Annual Interest Rate: ");
     float annualInterestRate= Float.parseFloat(scanner.nextLine());
     System.out.print("Period (Years): ");
     byte periodInYears=Byte.parseByte(scanner.nextLine());
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
