import java.util.Scanner;
import java.util.ArrayList;

public class GetStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Numbers Of Stairs: ");
        int noOfStairs = scn.nextInt();
        ArrayList<String> path = getStairPath(noOfStairs);
        System.out.println("The Numbers Of Ways:" + path);
        System.gc();
        scn.close();
    }
    public static ArrayList<String> getStairPath(int n){
        if(n == 0) {
            ArrayList<String> tempList = new ArrayList<>();
            tempList.add("");
            return tempList;           
        }else if (n < 0) {
            ArrayList<String> tempList = new ArrayList<>();
            return tempList;           
        }
        
        ArrayList<String> pathOne = getStairPath(n - 1);
        ArrayList<String> pathTwo = getStairPath(n - 2); 
        ArrayList<String> pathThree = getStairPath(n - 3);
        ArrayList<String> allPath = new ArrayList<>();

        for(String path: pathOne) {
            allPath.add(1 + path);
        }
        for(String path: pathTwo) {
            allPath.add(2 + path);
        }
        for(String path: pathThree) {
            allPath.add(3 + path);
        }
        return allPath;
    }
}
