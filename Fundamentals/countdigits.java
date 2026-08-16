package Fundamentals;

public class countdigits {
    public static void main(String[] args) {
        int n = 19340; 
        int count  = 0 ; 
        while(n > 0) {
            int digit = n % 10 ; 
            n = n/10 ; 
            count ++ ;
            System.out.println(digit);
          

        }
          System.out.println("Count of digits is : " + count);
    }
}
