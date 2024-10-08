
import java.util.Scanner;

public class finalSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int salary = sc.nextInt();

        int bonus = 0;
        if (age > 60) {
            bonus = 1000;
        } else if (age > 40 && age <= 60) {
            bonus = 500;
        }

        System.out.println(salary + bonus);
    }
}
