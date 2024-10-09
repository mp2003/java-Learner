

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String fib = "";
        int a = 0, b = 1;
        fib += (a) + " " + (b) + " ";
        for (int i = 1; i <= n; i++) {
            int sum = a + b;
            fib += sum + " ";
            a = b;
            b = sum;
        }

        System.out.println(fib);
    }
}
