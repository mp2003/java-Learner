
import java.util.Scanner;

public class PrintThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() >=4){
            System.out.println(str.charAt(3));
        } else{
            System.out.println("Small string");
        }
    }
}
