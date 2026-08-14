package Patterns;

public class numberpattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n - 1; i >= 0; i--) {

            int start = i * (i + 1) / 2 + 1;
            int end = start + i;

            if (i % 2 == 0) {

                // reverse
                for (int j = end; j >= start; j--) {
                    System.out.print(j + " ");
                }

            } else {

                // normal
                for (int j = start; j <= end; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}