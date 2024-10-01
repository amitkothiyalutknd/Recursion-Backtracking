// import java.io.*;
import java.util.*;

public class PrintDecInc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = scn.nextInt();
        DecreasingIncreasing(n);
        System.out.println("Printing Finished.");
    }
    public static void DecreasingIncreasing(int n) {
        if ( n == 0) {
            return;
        }
        System.out.println(n);
        DecreasingIncreasing(n - 1);
        System.out.println(n);
    }
}
