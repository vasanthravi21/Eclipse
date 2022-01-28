package AscendingOrder;

import java.util.Arrays;

public class Ascending {
    public static void main(String args[]){
        //Ascending order  ==> Swaping  &&Descending
        int[] a = new int[]{1,2,3,3,2,14,5,6,7,8,9};
        System.out.println("Before Sort "+ Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){        //change a[i] < a[j]
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After Sort "+Arrays.toString(a));
    }
}
