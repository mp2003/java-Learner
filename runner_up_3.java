
import java.util.Scanner;

public class runner_up_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else if (a > c) {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a < c) {
            if (b > c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        }

    }
}
