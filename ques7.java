
import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++){
            for ( int k = n -i -1 ; k >=0 ; k--){
                System.out.print(" ");
            }
            for ( int j =0 ;j <= i ; j++){
                System.out.print( i-j + 1);
            }
            for ( int j =0 ;j < i ; j++){
                System.out.print( j + 2);
            }
            
            System.out.println();
        }
    }
}
