
import java.util.Scanner;

public class vote {
    public static String isEligible(int age){
        return age >=18 ? "YES":"NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isEligible(x));
    }
}
