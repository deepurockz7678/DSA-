package Fundamentals;

public class armstring {
    public static void main (String [] args) {
        int n = 9474 ; 
        int sum = 0 ; 
        int temp = n ; 
        while(n>0){
            int digit = n%10 ; 
            n = n/10 ; 
            sum = sum + powwer(digit,countDigits(temp)) ;
        }
        if(sum == temp){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
    public static int powwer(int a, int b){
        int ans = 1 ; 
        for(int i = 1 ; i <= b ; i++){
            ans = ans * a ; 
        }
        return ans ; 
    }
    public static int countDigits(int n){
        int count = 0 ; 
        while(n>0){
            n = n/10 ; 
            count ++ ;
        }
        return count ; 
    }
}  

