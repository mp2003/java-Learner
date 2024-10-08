
import java.util.Scanner;

public class PrintBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int t = sc.nextInt();
        double bonus = 0.0;
        if (t > 5) {
            bonus = (float)(salary) * (0.05);
        }

        System.out.println((int) bonus);

    }
}
