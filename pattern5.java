
public class pattern5 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
