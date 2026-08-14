package Patterns;


public class fulldiamondalpha {
    public static void main (String [] args) {
        int n = 5 ; 
        for(int i = 1 ; i <= n ; i++) {
            //space
            for (int j = 1 ; j <= n - i ; j++) {
                System.out.print("  ");
            }
            for(char c = 'A' ; c < 'A' + i ; c++ ) {
                System.out.print(c +"  ");
            }
            System.out.println();
        }
        for(int i = n - 1 ; i >=1; i--) {
            //space 
            for(int j = 1 ; j <= n - i ; j++) 
                System.out.print("  ");
            
            for(char c = 'A' ; c < 'A' + i ; c++) {
                System.out.print(c +"  ");
            }
            System.out.println();
        }

        }       
    }

