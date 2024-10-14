
import java.util.Scanner;

public class printPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = n;
        while (start >= 1) {
            if (start % 8 == 0) {
                System.out.print(start + " ");
            }
            start = start - 1;
        }
    }
}
