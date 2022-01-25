package FibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        //Task to print fibonacci series of a given number
        int n,a=-1,b=1,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = in.nextInt();
        for(int i = 1;i <= n;i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
