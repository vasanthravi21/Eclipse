package StrongNumber;

import java.util.Scanner;

public class Strong {
    public static void main(String agrs[]){
        //Write a program to check the given number is Strong number or not.
        int num,i,originalNum,rem,fact,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = in.nextInt();
        originalNum = num;
        while (num > 0){
            rem = num % 10;
            fact = 1;
            for(i=1;i<=rem;i++){
                fact *= i;
            }
            sum +=fact;
            num = num / 10;
        }
        if(sum == originalNum) {
            System.out.println(originalNum+" is a Strong Number");
        }else {
            System.out.println(originalNum+" is not a Strong Number");
        }
    }
}
