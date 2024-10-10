
import java.util.Scanner;

public class DivisibleBy3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for x, y, z
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x % 3 == 0) {
            if (y >= 200) {
                z += 10;
            } else if (y >= 100 && y < 200) {
                z += 5;
            } else if (y >= 50 && y < 100) {
                z += 4;
            } else if (y < 50) {
                z += 1;
            }
        } else {
            if (y >= 200) {
                z += 3;
            } else if (y >= 100 && y < 200) {
                z += 2;
            } else if (y < 100) {
                z += 1;
            }
        }

        z += 10;

        System.out.println(z);
    }
}
