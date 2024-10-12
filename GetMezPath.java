import java.util.ArrayList;
import java.util.Scanner;

public class GetMezPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Number Of Rows: ");
        int rows = scn.nextInt();
        System.out.print("Enter The Number Of Columns: ");
        int columns = scn.nextInt();
        ArrayList<String> path = getStairPath(0, 0, rows - 1, columns - 1);
        System.out.println("The Numbers Of Ways:" + path);
        System.gc();
        scn.close();
    }
    public static ArrayList<String> getStairPath(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        if(sourceRow == destinationRow && sourceColumn == destinationColumn) {
            ArrayList<String> tempList = new ArrayList<>();
            tempList.add("");
            return tempList;
        }
        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();
        if (sourceColumn < destinationColumn) {
            horizontalPath = getStairPath(sourceRow, sourceColumn + 1, destinationRow, destinationColumn);
        }
        if (sourceRow < destinationRow) {
            verticalPath = getStairPath(sourceRow + 1, sourceColumn, destinationRow, destinationColumn);
        }
        
        ArrayList<String> allPaths = new ArrayList<>();
        for (String path : horizontalPath) {
            allPaths.add("H" + path);
        }
        for (String path : verticalPath) {
            allPaths.add("V" + path);
        }
        return allPaths;
    }
}
