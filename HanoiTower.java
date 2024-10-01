import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = scn.nextInt();
        System.out.print("Enter The Name Of First Tower: ");
        char A = scn.next(".").charAt(0);
        System.out.print("Enter The Name Of Second Tower: ");
        char B = scn.next(".").charAt(0);
        System.out.print("Enter The Name Of Third Tower: ");
        char C = scn.next(".").charAt(0);
        recurseFlow(n, A, B, C);
    }

    public static void recurseFlow(int n, char A, char B, char C) {
        if (n == 0) {
            return;
        }
        recurseFlow(n-1, A, C, B);
        System.out.println(n + "[" + A + "->" + B + "]");
        recurseFlow(n-1, C, B, A);
    }
}