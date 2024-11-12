
import java.util.*;

public class ques2 {

    public static void plusX(int[] nums, int x) {
        int sum = x + nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0 && nums[i] + sum > 9) {
                break;
            }

            if (sum <= 9) {
                nums[i] += sum;
                System.out.print("nums ");

                printArr(nums);
                return;
            }
            int rem = sum % 10;
            nums[i] = rem;
            sum /= 10;
        }
        int sum1 = nums[nums.length - 1] + x;
        int res[] = new int[nums.length + 1];
        for (int i = res.length - 1; i >= 0; i--) {
            
        }
        System.out.print("res ");
        printArr(res);
    }

    public static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
