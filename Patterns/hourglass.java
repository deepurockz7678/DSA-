package Patterns;

public class hourglass {
    public static void main (String [] args) {
        int n = 3 ; 
        for(int i = 1 ; i <= n  ; i++) {
            //space 
            for(int j = 0 ; j < i - 1  ; j++) {
                System.out.print("  ");
            }
            for(int j = 0 ; j < 2*(n-i) +1 ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        for(int i = n ; i >=1 ; i--){
            //space 
            for(int j = 0 ; j < i- 1 ; j++) {
                System.out.print("  ");
            }
            for(int j = 0 ; j < 2*(n-i) +1  ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
