
import java.util.Scanner;

public class GCD {

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int gcd = calculateGCD(x, y);
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd);
    }
}
