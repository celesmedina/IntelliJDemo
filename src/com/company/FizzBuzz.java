package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class FizzBuzz {

    //escribir fizz cuando el numero es multiplo de 3
    //escribir buzz cuando el numero es multiplo de 5
    //escribir fizzbuzz cuando el numero es multiplo de 3 y de 5

    public static void main(String[] args) {
        //¿Como hacer esto con operadores ternarios?
        Scanner scanner= new Scanner (System.in);
        System.out.print("Number: ");
        int numberTyped=Integer.parseInt(scanner.nextLine());
        if (numberTyped%3== 0 && numberTyped%5==0)
        System.out.println("FizzBuzz");
        else if (numberTyped%5==0)
            System.out.println("Buzz");
        else if (numberTyped%3==0)
            System.out.println("Fizz");
        else
            System.out.println(numberTyped);





    }
}
