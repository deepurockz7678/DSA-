package Patterns;

public class fulldiamond {
    public static void main (String [] args) {
        int n = 5  ;
        //pyrmaid for  n 
        for(int i = 1 ; i <=n ; i++) {
            //space 
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i ; j++) {
                System.out.print("*" +" " );
            }
            System.out.println();
        }
        //downward pyramid  
        for(int i = n - 1 ; i >= 1 ; i--) {
            //space 
            //i = 4 j should be 1 
            //i = 3 ; j should be 1 to 2 
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print( " ");
            }
            //this should be 4 
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}

/*

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */