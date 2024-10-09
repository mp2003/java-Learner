
import java.util.Scanner;

public class evenOddCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 1;
        int positive = 0, negative = 0, zero = 0;
        while (ch != -1) {
            int x = sc.nextInt();
            if (x > 0) {
                positive++;
            } else if (x < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("enter -1 to exit");
            ch = sc.nextInt();
        }

        System.out.printf("Positive: %d, Negative: %d, Zero: %d%n", positive, negative, zero);
    }
}
