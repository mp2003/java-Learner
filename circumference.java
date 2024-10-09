
import java.util.Scanner;

public class circumference {

    public static double cir(int r) {
        return (3.14 * 2 * r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();

        System.out.printf("%.2f", cir(rad));
    }
}
