package Fundamentals;

public class factors {
    public static void main(String[] args) {
        int num = 79 ;
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i * i  <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + "*" + (num / i) + " ");
            }
        }
    }
}
