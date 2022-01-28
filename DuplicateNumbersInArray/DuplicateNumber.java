package DuplicateNumbersInArray;

public class DuplicateNumber {
    public static void main(String args[]){
        //Task to print Duplicate numbers in an array
        int []a = {7,8,9,4,5,6,1,2,3,4,5,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i] == a[j]) && (i !=j )){
                    System.out.println("Duplicate Number : "+a[j]);
                }

            }
        }
    }
}
