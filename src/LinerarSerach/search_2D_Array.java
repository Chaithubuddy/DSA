package LinerarSerach;

import java.util.Arrays;

public class search_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 67, 78, 32},
                {23, 45, 1}
        };
        int target = 67;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {//arr[row].length
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};

    }


}

