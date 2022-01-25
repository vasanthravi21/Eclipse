package Sum_Ave;

import java.util.Scanner;

public class SumAve {
    public static void main(String args[]){
        //Write a program to find sum and average for given n numbers.
        int sum=0,ave=0,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = in.nextInt();
        for(int i=1;i <= n;i++){
            System.out.println("Enter the "+i+" Number : ");
            int number = in.nextInt();
            sum += number;
        }
        System.out.println("The Sum of Given Number : "+sum);
        System.out.println("The Average of Given Number : "+sum/n);

    }
}
