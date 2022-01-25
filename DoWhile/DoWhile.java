package DoWhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        //DoWhile is an Exit check loop
        System.out.println("Enter the limit : ");
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
            //i = i + 2  // for printing even numbers
        }while(i<=n);
    }
}
