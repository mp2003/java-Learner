
public class pattern17 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int sp = n - (i + 1);
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
