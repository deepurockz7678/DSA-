package Fundamentals;

public class palindrome {
    public static void main(String[] args) {
        int n = 12321; 
        int original = n; 
        int reverse = 0 ; 
        while(n>0){
            int digit = n%10 ; 
            n = n/10 ; 
            reverse = reverse * 10 + digit ;
        }
        if(original == reverse){
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}
