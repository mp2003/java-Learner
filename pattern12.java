
public class pattern12 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int sp = n - (i + 1);
            for (int j = sp; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}
