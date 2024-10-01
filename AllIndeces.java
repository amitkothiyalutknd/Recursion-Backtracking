import java.util.*;

public class AllIndeces {
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
        int count = 0;
        int[] newArr = indeces(0, arr, number, count);

        if(newArr.length == 0) {
            System.out.println();
            return;
        }
        System.out.print("The New Array With Index Of Finding Number are: ") ;
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] indeces(int n, int[] arr, int number, int count) {
        if (n == arr.length) {
            return new int[count];
        }
        if (arr[n] == number) {
            int[] newArr = indeces(n + 1, arr, number, count + 1);
            newArr[count] = n;
            return newArr;
        } else {
            int[] newArr = indeces(n + 1, arr, number, count);
            return newArr;
        }
    }
}
