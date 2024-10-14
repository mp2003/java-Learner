
import java.util.Scanner;

public class prtintPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 2;
        while (n <= num) {
            System.out.println(n + " ");
            n = n + 7;
        }
    }
}
