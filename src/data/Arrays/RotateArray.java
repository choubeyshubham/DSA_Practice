package data.Arrays;

import java.util.Arrays;

public class RotateArray {

    void main() {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 9, 10, 11, 14, 16};
        int k1 = 3;
        rotate(arr1, k1);
        System.out.println(Arrays.toString(arr1));   //[11, 14, 16, 1, 2, 3, 4, 5, 6, 9, 10]



        int[] arr2 = {1, 2, 3, 4, 5};//[4, 5, 1, 2, 3]
        int k2 = 2;
        rotate(arr2, k2);


    }


    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private void swap(int[] nums, int l, int r) {
        final int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }


}
