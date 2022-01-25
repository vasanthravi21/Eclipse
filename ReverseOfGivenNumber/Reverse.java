package ReverseOfGivenNumber;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        //Task to find a reverse of a given number.
        int n,reverse=0,rem=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        n = in.nextInt();
        while (n != 0){
            rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n / 10;
        }
        System.out.println("Reversed Number is : "+reverse);
    }
}
