
import java.util.Scanner;

public class greaterNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(Math.max(a,b));
        sc.close();

    }
}
