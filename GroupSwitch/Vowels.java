package GroupSwitch;

import java.util.Scanner;

public class Vowels {
    public static void main(String ars[]){
        char c;
        System.out.println("Enter the character :");
        Scanner in=new Scanner(System.in);
        c = in.next().charAt(0);
        switch (c){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println(c+" is an Vowel");
                break;
            default:
                System.out.println(c+" is not an Vowel");
                break;
        }

    }
}
