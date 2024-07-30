package LinerarSerach;

public class maxArray2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 67, 78, 32},
                {23, 45, 1}
        };
        

    }

    public static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] > max) {
//                    max = arr[row][col];
//
//                }
//
//            }
//
//        }

        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }
            }
        }
        return max;
    }
}
