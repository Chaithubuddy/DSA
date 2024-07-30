package LinerarSerach;

import java.util.Arrays;

public class stringSerach {
    public static void main(String[] args) {
        String s = "chaithu";

        //converting string to arry[] of char=chaithu = [c, h, a, i, t, h, u]
        char[]  charArray=s.toCharArray();
        System.out.println(Arrays.toString(charArray));


    }
    public static void main1(String[] args) {
        String s = "chaithu";
        char traget = 'a';
        //boolean ans1 = findLetter(s, traget);
        boolean ans = findLetter(s, traget);
        System.out.println(ans);

    }
//enhanced lopp
    static boolean findLetter(String s, char traget) {
        if (s.length() == 0) {
            return false;

        }
        for (char ans : s.toCharArray()) {
            if (ans == traget) {
                return true;
            }
        }
        return false;

    }
//normal
    public static boolean findLetter1(String s, char traget) {
        if (s.length() == 0) {
            return false;

        }
        for (int i = 0; i < s.length(); i++) {
            if (traget == s.charAt(i)) {
                return true;
            }

        }
        return false;
    }
}
