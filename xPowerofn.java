import java.util.Scanner;

public class xPowerofn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int x = scn.nextInt();
        System.out.print("Enter The Power Of Number: ");
        int n = scn.nextInt();
        int output = power(2, 4);
        System.out.print("The Output Is: ");
        System.out.print(output);
    }
    public static int power(int x, int n) {
        if ( n == 0) {
            return 1;
        }
        int xnum = power(x, n -1);
        int xn = x * xnum;
        return xn;
    }
}
