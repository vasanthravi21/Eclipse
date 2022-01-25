package Armstrong;

import Sum_Ave.SumAve;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        //Task to print Whether the given number is Armstrong or not.
        int num,digit1,digit2,digit3,result = 0,originalNumber;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3digit Number : ");
        num = in.nextInt();
        originalNumber = num;

        digit3 = num % 10;
        num = num /10;
        digit2 = num % 10;
        num = num /10;
        digit1 = num % 10;
        num = num /10;

        result = (digit1*digit1*digit1) + (digit2*digit2*digit2) + (digit3*digit3*digit3);
        if(originalNumber == result){
            System.out.println(originalNumber+" is an Armstrong Number");
        }else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }
    }
}
