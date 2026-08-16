package Fundamentals;

public class hcf {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        
        while( b != 0) {
            int rem = a % b ; 
            a = b ; 
            b = rem ;
        } 
        System.out.println("HCF is : " + a);
    }
}
