package InsertElementInArray;

import java.util.Arrays;

public class InsertElementArray {
    public static void main(String args[])
    {
        //Program to insert a element in specific index of an array.
        int [] a = {10,30,20,40,50,60,70,80,90};
        int index = 2;
        int value = 124;
        System.out.println("Before Insert "+ Arrays.toString(a));
        for(int i=a.length-1;i>index;i--){
            a[i] = a[i-1];
        }
        a[index] = value;
        System.out.println("After Insert "+Arrays.toString(a));
    }
}
