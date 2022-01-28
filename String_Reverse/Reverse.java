package String_Reverse;

public class Reverse {
    public static void main(String args[]){
        StringBuffer a=new StringBuffer("Vasanth is a Computer Science Engineering Student");
        System.out.println(a);
        StringBuffer b=new StringBuffer();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
