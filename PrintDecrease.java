import java.util.Scanner;

public class PrintDecrease {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input Number For Printing Range: ");
        int n = scn.nextInt();
        printDecreasing(n);
        System.out.println("Printing Finished");
    }
    public static void printDecreasing(int n) {
        if (n == 0) {
            return;   
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}