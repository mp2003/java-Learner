
import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5   ;
        for (int i = n; i > 0; i--) {
            for (int k = (n - i + 1); k > 0; k--) {

                System.out.print("*");
            }

            for (int j = 2 * (i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = (n - i + 1); k > 0; k--) {
                // if ( k == n-i+1)

                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int k = (n - i + 1); k > 0; k--) {
                System.out.print("*");
            }

            for (int j = 2 * (i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = (n - i + 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
