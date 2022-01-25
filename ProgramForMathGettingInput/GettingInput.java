package ProgramForMathGettingInput;

import java.util.Scanner;

public class GettingInput {
    public static void main(String args[]){
        //Task to print a2 + b2 + 2ab
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = in.nextInt();
        b = in.nextInt();
        c = (a*a) + (b*b) + (2*a*b);
        System.out.println("Result : "+c);
    }
}
