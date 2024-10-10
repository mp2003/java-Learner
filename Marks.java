
import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sub1 = sc.nextDouble();
        double sub2 = sc.nextDouble();
        double sub3 = sc.nextDouble();
        double sub4 = sc.nextDouble();
        double sub5 = sc.nextDouble();

        double Sum = sub1 + sub2 + sub3 + sub4 + sub5;
        double Percent = Sum * 0.2;
        System.out.printf("%.1f", Sum);
        System.out.printf(" %.1f", Percent);
    }
}
