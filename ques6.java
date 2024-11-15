import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        f ( int i = 0 ; i<= n ; i++){
            for ( int j =0 ; j < n ; j++){
                if ( i == j || i + j == n - 1)
                    System.out.print("x\t");
                else 
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
