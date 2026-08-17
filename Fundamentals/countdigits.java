package Fundamentals;

public class countdigits {
    public static void main(String[] args) {
        int n = 260205 ; 
        
        while(n > 0) {
            int rem = n % 10 ; 
            n = n / 10 ;   
    
            System.out.println(rem);
        }
        
    }
}
