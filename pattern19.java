
import java.util.Scanner;

public class pattern19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 0; i -= 2) {
            for (int k = (n - i) / 2; k > 0; k--) {
                System.out.print("\t");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i += 2) {
            for (int k = (n - i) / 2; k > 0; k--) {
                System.out.print("\t");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
