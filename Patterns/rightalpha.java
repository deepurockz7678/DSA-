package Patterns;

public class rightalpha {
    public static void main (String [] args) {
        int n = 5 ; 
        for(int i = 1 ; i <= n ; i++) {
            for(char j = 'A' ; j < 'A' + i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
A 
A B 
A B C 
A B C D 
A B C D E 

*/