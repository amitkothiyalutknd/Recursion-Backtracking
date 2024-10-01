import java.util.Scanner;

// public class PrintIncrease {
//     public static void main(String[] args) {
//         int l = 0;
//         System.out.println("Enter The Number To Print Range: ");
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         printIncreasing(l, n);
//     }
//     public static void printIncreasing(int l, int n) {
//         if (l <= n ) {
//             System.out.println(l);
//             printIncreasing(l+1, n);
//         } else {
//             System.out.println("Printing Finished.");
//             return;
//         }
//     }
// }

public class PrintIncrease {
    public static void main(String[] args) {
        System.out.println("Enter The Number To Print Range: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
        System.out.println("Printing Finished.");
    }
    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
}