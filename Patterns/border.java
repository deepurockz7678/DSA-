package Patterns;

public class border {
    public static void main (String [] args) {
        int n = 4
        
         ; 
        for(int i = 0 ; i < 2*n - 1 ; i++) {
            for(int j = 0 ; j < 2*n - 1 ; j++){
                int val = n -  Math.min(Math.min(i , j ) , Math.min(2*n - 2- i , 2*n - 2 - j));
                    System.out.print(val +" ");
            }
            System.out.println(" ");
        }
    }
}
