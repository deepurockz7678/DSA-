package Fundamentals;

public class reverse {
    public static void main(String[] args) {
        int n = 12345; 
        int reverse = 0 ; 
        while(n>0){
            int digit = n%10 ; 
            n = n/10 ; 
            reverse = reverse * 10 + digit ;
        }
        System.out.println("Reverse of the number is : " + reverse);
    }
}
