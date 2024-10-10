
import java.util.Scanner;

public class evenOdd2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0 && x > 1000) {
            System.out.println("Even and above 1000");
        } else if (x % 2 == 0 && x <= 1000) {
            System.out.println("Even");
        } else if (x % 2 != 0 && x > 1000) {
            System.out.println("Odd and above 1000");
        } else if (x % 2 != 0 && x <= 1000) {
            System.out.println("Odd");
        }

    }
}
