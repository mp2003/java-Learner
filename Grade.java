
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
                System.out.print("Excellent!.");
                break;
            case 'B':
                System.out.println("Well done!.");
                break;
            case 'C':
                System.out.println("You passed!.");
                break;
            case 'F':
                System.out.println("Better luck next time");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
