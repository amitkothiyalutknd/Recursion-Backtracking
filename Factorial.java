import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter The Number For Factorial: ");
        // int n = scn.nextInt();
        int output = fact(4);
        System.out.print("The Factorial Output Is: ");
        System.out.print(output);
    }
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
