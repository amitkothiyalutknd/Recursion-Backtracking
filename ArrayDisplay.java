import java.util.*;

public class ArrayDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter The Number For " + i + " index: ");
            arr[i] = scn.nextInt();
        }
        System.out.print("Array in Ascending Order are: ");
        ArrayDisplayInAsc(n - 1, arr);
        System.out.print("\nArray in Descending Order are: ");
        ArrayDisplayInDsc(n - 1, arr);
    }
    public static void ArrayDisplayInAsc(int n, int[] arr) {
        if (n < 0) {
            return;
        }
        ArrayDisplayInAsc(n-1, arr);
        System.out.print(" " + arr[n]);
    }
    public static void ArrayDisplayInDsc(int n, int[] arr) {
        if (n < 0) {
            return;
        }
        System.out.print(" " + arr[n]);
        ArrayDisplayInDsc(n-1, arr);
    }
    
}
