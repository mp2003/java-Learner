
import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        for (int i = n; i >= 0; i -= 2) {
            for (int k = 0; k <= (n - i) / 2; k++) {
                if (k == (n - i) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("*\t");
                }
            }

            for (int j = 0; j < i - 1; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k <= (n - i) / 2; k++) {
                if (k == (n - i) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i <= n; i += 2) {
            for (int k = 0; k <= (n - i) / 2; k++) {
                if (k == (n - i) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("*\t");
                }
            }

            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k <= (n - i) / 2; k++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
