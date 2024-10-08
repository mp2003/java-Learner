import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.print(a % 2 ==0 ? "Even" : "Odd");
        sc.close();
    }
}
