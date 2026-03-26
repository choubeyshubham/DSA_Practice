package data.DynamicPrograming;

public class LongestIncreasingSubsequence {


    void main() {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lis(arr)); // 4

    }

    public static int lis(int[] arr) {
        int[] tail = new int[arr.length];
        int size = 0;
        for (int a : arr) {
            int left = 0;
            int right = size;
            while (left < right) {
                int mid = (left + right) / 2;
                if (tail[mid] < a) left = mid + 1;
                else right = mid;
            }
            tail[left] = a;
            if (left == size) size++;
        }
        return size;
    }



}

