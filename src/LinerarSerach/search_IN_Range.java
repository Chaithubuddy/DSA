package LinerarSerach;

public class search_IN_Range {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 18, 45, 56, 45};
        int target = 18;
        int ans = serachInRange(arr, 1, 7, target);
        System.out.println(ans);

    }

    static int serachInRange(int[] arr, int start, int end, int target) {
        if (arr.length == -0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
