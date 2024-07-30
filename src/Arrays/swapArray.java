package Arrays;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[]arr={2,4,35,1,6};
      //  System.out.println(arr[2]);

        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int number1, int number2) {

        int temp=arr[number1];
        arr[number1]=arr[number2];
        arr[number2]=temp;

    }
}
