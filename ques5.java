
import java.util.Scanner;

public class ques5 {

    public static void plusX(int nums[], int x) {
        int n = nums.length;
        int c = x;
        for (int i = n - 1; i >= 0; i--) {
            int sum = c + nums[i];
            if (sum < 10) {
                nums[i] = sum;
                c = 0;
                break;
            } else {
                nums[i] = sum % 10;
                c = sum / 10;
            }
        }
        if (c > 0) {
            System.out.print(c + " ");
        }
        printArr(nums);
    }

    public static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        plusX(arr, x);
    }

}
