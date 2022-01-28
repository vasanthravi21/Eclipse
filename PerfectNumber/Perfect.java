package PerfectNumber;

import java.util.Scanner;

public class Perfect {
    public static void main(String args[]){
        //Write a program to check the given number is perfect number or not.
        //perfect Numbers between 1 to 100 is only 6 and 28
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0)    sum = sum+i;
        }
        if(sum == n)    System.out.println(n+" is a perfect number");
        else    System.out.println(n+ " is not a perfect number");
    }
}
