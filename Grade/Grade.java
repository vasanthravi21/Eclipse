package Grade;

import java.util.Scanner;

public class Grade {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Average Mark :  ");
        float ave;
        ave = in.nextFloat();
        if(ave >= 90 && ave <=100){
            System.out.println("Grade O");
        }
        else if(ave >= 80 && ave <=89){
            System.out.println("Grade A");
        }
        else if(ave >= 70 && ave <= 79){
            System.out.println("Grade B");
        }
        else if(ave >= 60 && ave <= 69){
            System.out.println("Grade C");
        }
        else if(ave >= 50 && ave <= 59){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade E");
        }

    }
}
