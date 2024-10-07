
public class pattern15 {

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

            int sp = 2 * (n - (i + 1));
            for (int j = sp; j >= 0; j--) {
                System.out.print(" ");
            }
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
        for (int i = n - 1; i >= 0; i--) {
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

            int sp = 2 * (n - (i + 1));
            for (int j = sp; j >= 0; j--) {
                System.out.print(" ");
            }
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
