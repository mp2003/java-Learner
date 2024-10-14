
import java.io.*;
import java.util.*;

public class addIfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (Character.isDigit(ch)) {
            // System.out.println(Character.getNumericValue(ch)+100);
            System.out.println((int) (ch) - 48  + 100);
        } else {
            System.out.println("Not a digit");
        }
    }
}
