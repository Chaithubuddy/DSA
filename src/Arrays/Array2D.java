package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
       // 1234
    //    567
   ///    898int n=3;

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] +" ");
            }
            System.out.println();

        }

        }


      }
//    public static void main1(String[] args) {
//        int[][] arr1 = new int[3][];
//
//
////        for (int i = 0; i <arr.length ; i++) {  //->
////            System.out.print(arr[i]);
////
////        }
//        }
//
//    }

