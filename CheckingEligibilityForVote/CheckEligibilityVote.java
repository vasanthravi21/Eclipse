package CheckingEligibilityForVote;

import java.util.Scanner;

public class CheckEligibilityVote {
    public static void main(String args[]){
        //Checking eligibility for vote or not
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible for vote");
        }else {
            System.out.println("You are not Eligible for vote");
        }
    }
}
