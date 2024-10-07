
public class pattern13 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int sp = n - (i + 1);
            for (int j = sp; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = i + 1; j > 0; j--) {
                System.out.print((j ));
            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print(j+1);
            }

            System.out.println();
        }
    }
}
