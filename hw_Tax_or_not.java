
import java.util.Scanner;

public class hw_Tax_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        System.out.println(salary >= 500000 ? "Tax to be paid" : " No tax to be paid");
        sc.close();

    }
}
