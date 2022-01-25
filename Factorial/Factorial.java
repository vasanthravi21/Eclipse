package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        //Task to find Factorial of given number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        System.out.println("Factorial of "+n+" is : "+f);
    }
}
