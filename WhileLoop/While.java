package WhileLoop;

import java.util.Scanner;

public class While {
    public static void main(String args[]){
        //While loop
        //While loop is an Entry Check loop
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n=in.nextInt();
        int i=1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
