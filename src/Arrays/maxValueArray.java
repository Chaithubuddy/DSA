package Arrays;

import java.util.Scanner;

public class maxValueArray {
    public static void main(String[] args) {
        //armstrong=153 1 125 9

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(isPaligram(number));

    }

    public static boolean isPaligram(int number) {
        int original = number;
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans =ans+ rem * rem * rem;
            number = number / 10;


        }
        return original == ans;


    }

    public static void main2(String[] args) {
        //reverse
        int number = 123463;
        int rev = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            rev = rev * 10 + rem;


        }
        System.out.println(rev);

    }

    public static void main1(String[] args) {

        int[] arr = {2, 4, 35, 1, 6};

        int ans = max(arr);
        System.out.println(ans);

    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }


}
