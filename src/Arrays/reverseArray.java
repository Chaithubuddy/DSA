package Arrays;


import java.util.Arrays;


public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr) {
        int start = arr[0];
        int end = arr.length - 1;
        while (start < end) {
            //swap
           // swap(arr, start, end);
            swap(arr, start, end);
            start++;
            end--;


        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
