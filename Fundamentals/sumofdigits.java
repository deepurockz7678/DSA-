package Fundamentals;

public class sumofdigits {
    public static void main (String [] args) {
        int n = 12354; 
        int sum = 0 ; 
        while(n>0){
            int digit = n%10 ; 
            n = n/10 ; 
            sum = sum + digit ;
        }
        System.out.println("Sum of digits is : " + sum);
    } 
}
