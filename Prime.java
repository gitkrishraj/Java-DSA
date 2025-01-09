

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        } else {
            return false;
        }
    }
}