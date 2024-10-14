
import java.util.Scanner;

public class prtintPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int q = 20;
        int num = 1;
        while (num <= q) {
            System.out.print(n * num + " ");
            num++;
        }
    }
}
