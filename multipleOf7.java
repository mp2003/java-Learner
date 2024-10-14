
import java.util.Scanner;

public class multipleOf7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int q = num / 7;
        for (int i = 0; i <= q; i++) {
            System.out.print(7 * i + " ");
        }

    }
}
