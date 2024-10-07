
public class pattern16 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            if (i < 2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
