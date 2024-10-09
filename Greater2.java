
import java.util.Scanner;

public class Greater2 {

    public static int MaxNum(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(MaxNum(x, y));
    }

}
