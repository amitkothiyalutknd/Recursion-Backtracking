import java.util.*;

public class FindLstIdxOfn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter The Number For " + i + " index: ");
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter The Number Of An Array Which Index Has To Find: ");
        int number = scn.nextInt();
        int index = getIndex(0, arr, number);
        System.out.println("The Index Of " + number + " In The Array Is: " + index);
    }
    public static int getIndex(int n, int[] arr, int number) {
        if (n == arr.length) {
            return -1;
        }
        int indexOfn = getIndex(n+1, arr, number);
        if (indexOfn == -1) {
            if (arr[n] == number) {
                return n;
            } else {
                return -1;
            }
        } else {
            return indexOfn;
        }
    }
}
