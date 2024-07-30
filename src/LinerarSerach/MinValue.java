package LinerarSerach;

import java.util.Arrays;
import java.util.Map;

public class MinValue {
   
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, -18, 45, 56, 45};
        //  int ans = findMin(arr);
        int ans = findMax(arr);
        System.out.println(ans);

    }

    public static int findMax(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }


    public static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
