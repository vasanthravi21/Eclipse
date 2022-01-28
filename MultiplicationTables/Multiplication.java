package MultiplicationTables;

import java.util.Scanner;

public class Multiplication {
    public static void main(String args[]){
        //Task to print Multiplication tables in user given limit
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Table : ");
        int t = in.nextInt();
        System.out.println("Enter The Limit : ");
        int limit = in.nextInt();
        for(int i = 1;i <= limit;i++){
            System.out.println(t+" x "+i+" = "+(t*i));
        }
    }
}
