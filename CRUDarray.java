
import java.util.Arrays;
import java.util.Scanner;

public class CRUDarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: " + Arrays.toString(arr));
    }
}
