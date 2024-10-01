import java.util.Scanner;
import java.util.Arrays;

public class ClimbingStair {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: ");
        int n = scn.nextInt();
        int cost[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter The Cost Of An Array In Index: " + i + "\t");
            cost[i] = scn.nextInt();
        }
        // for(int i = 0; i < n; i++) {
            //     System.out.println("The Cost In Index " + i + " is: " + cost[i]);
            // }
            System.out.print("The Values Of An Array Are: ");
            for (int value : cost) {
                System.out.print(" " + value);
            }
            System.out.println("\nThe Minimum Cost is: " + minCostClimbingStair(cost));
        }
        public static int minCostClimbingStair(int[] cost) {
            int [] Memo = new int[cost.length];
            Arrays.fill(Memo, -1);
            return Math.min(solve(0, cost, Memo), solve(1, cost, Memo));
        }
    public static int solve(int step, int[] cost, int[] Memo) {
        if (step == cost.length) return 0;
        if (step > cost.length) return Integer.MAX_VALUE;
        if (Memo[step] != -1) return Memo[step];
        
        int first = solve(step+1, cost, Memo);
        int second = solve(step+2, cost, Memo);
        return Memo[step] = Math.min(first, second) + cost[step];
    }
}
