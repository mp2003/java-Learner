
import java.util.Scanner;

public class MorF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case ('M'):
                System.out.println("You are a male");
                break;
            case ('m'):
                System.out.println("You are a male");
                break;
            case 'F':
                System.out.println("You are a female");
                break;
            case 'f':
                System.out.println("You are a female");
                break;
            default:
                System.out.println("Type again");
        }
    }
}
