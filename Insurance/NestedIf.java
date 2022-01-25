package Insurance;

import java.util.Scanner;

public class NestedIf {
    public static void main(String args[]){
        /*
            Nested if Statement
            A company insures its drivers in the following cases:
                a. If the driver is married.
                b. If the driver is unmarried, male & above 30 years of age.
                c. If the driver is unmarried, female  & above 25 years of age.
         */
        //Use tutor joe's alternate code vasanth "it's running " but use alter code
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Marital Status M/U: ");
        char marital = in.next().charAt(0);
        if(marital == 'm' || marital == 'M') {
            System.out.println("You are Enigible for insurance");
        }else if(marital =='u' || marital == 'U'){
            System.out.println("Enter Your Gender M/F");
            char gender = in.next().charAt(0);
            if(gender == 'm' || gender == 'M'){
                System.out.println("Enter Your Age : ");
                int age = in.nextInt();
                if(age >= 30) {
                    System.out.println("You Are Eligible for insurance..");
                }else{
                    System.out.println("You are not eligible for insurance");
                }
            }
            if(gender == 'f' || gender == 'F'){
                System.out.println("Enter Your Age : ");
                int age = in.nextInt();
                if(age >= 25) {
                    System.out.println("You Are Eligible for insurance..");
                }else{
                    System.out.println("You are not eligible for insurance");
                }
            }
        }
        else{
            System.out.println("Enter a valid input..");
        }
    }
}
