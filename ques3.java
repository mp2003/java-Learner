
import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i = n; i >= 0; i -= 2) {
            for (int k = 0; k < (n - i) / 2; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++) {

                // System.out.prin t (i + ""+j + "\t");

                if (i - j == 1 || j == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

        for (int i = 1; i <= n; i += 2) {
            for (int k = 0; k < (n - i) / 2; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++) {
                
                if (i - j == 1 || j == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
