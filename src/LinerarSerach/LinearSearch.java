package LinerarSerach;

public class LinearSearch {
    //note we didnot return -1 for elements;  for that we take constant =Integer.max.value;
    //we retrun -1 for index bez of no - value index are ,index start from 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 78, 65};
        int target = 65;
        //to get index of 6
        //  int ans1 = linearSearch1(arr, target);

        //for getting element;
        //  int ans = linearSearch2(arr, target);

        //for search & true or false;
        boolean ans = linearSearch3(arr, target);

        System.out.println(ans);

    }

    //for true or false
    public static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    //for getting element
    public static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;


        // tried enhanced
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//   return -1;

    }

    //for getting the index of element;
    public static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;

    }
}