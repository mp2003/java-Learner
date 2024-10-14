
import java.util.Scanner;

public class jumping_array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch >= 'a' && ch <= 'w') {
                System.out.println((char) (ch + 3));
            } else {
                System.out.println("Can't jump");
            }
        } else if (ch >= 'A' && ch <= 'Z') {
            if (ch >= 'D' && ch <= 'Z') {
                System.out.println((char) (ch - 3));
            } else {
                System.out.println("Can't jump");
            }
        }

    }

}
