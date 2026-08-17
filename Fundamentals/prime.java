package Fundamentals;

public class prime {
    public static void main(String[] args) {
        int n = 5; 
        boolean flag = true ; 
        if(n <= 1) {
            System.out.println(n + " It is not a prime nor a composite number");
            return ; 
        }
        else {
            for(int i = 2 ; i < n ; i++ ) {
                if(n % i == 0) {
                    flag  = false ; 
                    break ;
                }
            }
        }
        if(flag) 
            System.out.println(n + " IS a prime number"); 
        else
            System.out.println(n + " is not a prime number"); 

    }
}
