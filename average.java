
import java.util.Scanner;

public class average {

    public static float average(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(average(a, b, c));
    }
}
