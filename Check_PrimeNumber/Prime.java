package Check_PrimeNumber;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
    //Write a program to check the given number is prime or not
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int factor = 0;
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                factor++;
            }
        }
        if(factor == 2) {
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }

    }
}
