package Patterns;

public class reversealpha {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // alphabets
            for (char j = 'A'; j < 'A' + n - i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println();
        }
    }
}