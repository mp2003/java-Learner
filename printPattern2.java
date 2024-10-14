
import java.util.Scanner;

public class printPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 13;
        while (start >= n) {
            System.out.print(start + 8 + " ");
            start = start + 8;
        }
    }
}
