package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 34, 5};


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//           }


//        for (int j : arr) {
//            System.out.print(" " + j);
//            }



        System.out.println(Arrays.toString(arr));


    }

    public static void main3(String[] args) {
        Scanner s = new Scanner(System.in);


        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }

        for (int j : arr) {
            System.out.print(" " + j);

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main2(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];

        /* input taking without arr[0]=1; arr[1]=22; directly taking from scanner for loop; */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        Arrays.stream(arr).forEach(c -> System.out.print(" " + c));
    }
}
//    public static void main1(String[] args) {
//        int[] a=new int[5];
//        int []b={1,2,3,4,5};
//        Arrays.stream(b).forEach(c-> System.out.println(c));
//
//    }




