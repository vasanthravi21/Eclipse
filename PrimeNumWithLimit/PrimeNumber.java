package PrimeNumWithLimit;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        //Write a program to print the prime numbers between 1 to 999
        int number,factor=0;
        for(number = 1;number <= 999;number++){
            for(int i=1;i<=number;i++){
                if(number % i == 0){
                    factor++;
                }
            }
            if(factor == 2) {
                System.out.println(number + " is prime number");
            }
            factor=0;
        }
    }
}
