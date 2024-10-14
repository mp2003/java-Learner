
import java.util.Scanner;

public class Case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println("Small case");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("Upper Case");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("None");
        }
    }
}
