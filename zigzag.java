import java.util.Scanner;

public class zigzag {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = scn.nextInt();
        recurseFlow(n);
    }

    public static void recurseFlow(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Pre: " + n);
        recurseFlow(n -1);
        System.out.println("In: " + n);
        recurseFlow(n - 1);
        System.out.println("Post: " + n);
    }
}
