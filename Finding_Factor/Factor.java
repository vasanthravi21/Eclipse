package Finding_Factor;

import java.util.Scanner;

public class Factor {
    public static void main(String args[]){
        System.out.println("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 1;i <= num;i++){
            if(num % i == 0) System.out.println(i+" ");
        }
    }
}
