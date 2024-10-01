import java.util.*;

public class Subsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Main String: ");
        String str = scn.next();
        ArrayList<String> subStr = getSubStr(str);
        System.out.print("Output: " + subStr);
    }
    public static ArrayList<String> getSubStr(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char chr = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSubStr(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr: rres){
            mres.add("" + rstr);
        }
        for(String rstr: rres){
            mres.add(chr + rstr);
        }
        return mres;
    }
}