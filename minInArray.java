import java.util.*;

public class minInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter The Number For " + i + " index: ");
            arr[i] = scn.nextInt();
        }
        int smaller = minAnArray(0, arr);
        System.out.println("The Minimum Number In The Array Is: " + smaller);        
    }
    public static int minAnArray(int n, int[] arr) {
        if (n == arr.length - 1) {
            return arr[n];
        }
        int large = minAnArray(n + 1, arr);
        if (large < arr[n]) {
            return large;
        } else {
            return arr[n];
        }
    }
}
