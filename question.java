
import java.util.Scanner;

public class question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int k = 0; k < 2   * i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
