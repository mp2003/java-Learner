
public class pattern6 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(n - j  + " ");
            }
            System.out.println();
        }
    }
}
