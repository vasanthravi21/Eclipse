package Bitwise_And_Or_Xor;

public class BitwiseAndShift {
    public static void main(String args[]){
        //Bitwise & Shift operator in java
        int a=25, b=45;
        /*
            Working process
                1. First convert DEC2BIN(loc,4)
                2. perform AND GATE
                3. Convert BIN2DEC()
         */
        System.out.println("Bitwise AND : "+(a&b));
        System.out.println("Bitwise OR : "+(a|b));
        System.out.println("Bitwise XOR : "+(a^b));
        System.out.println("Bitwise NOT : "+(~a));
    }
}
