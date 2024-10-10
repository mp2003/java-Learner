
import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x >= 59 && y >= 10) {
            System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10\r\n");
        } else if (x >= 50 && y < 10) {
            System.out.println("X is greater than or equal to 50 and y is less than 10\r\n");
        } else {
            System.out.println("None of the condition matches");
        }
    }
}
