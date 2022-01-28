package Even_Odd_UsingArray;

import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        //Task to print number of even and odd elements in given array element.
        int n,e=0,o=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The limit : ");
        n = in.nextInt();
        int a [] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"] Value");
            a[i] = in.nextInt();
        }
        for(int element : a){
             if(element % 2 == 0){
                 e++;
             }else {
                 o++;
             }
        }
        System.out.println("Total Even Nos : "+e);
        System.out.println("Total Odd Nos: "+o);
    }
}
