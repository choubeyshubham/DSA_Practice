package data;

public class RainWater {


    void main() {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        int[] arr2 = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(rainWaterBrute(arr2));
        System.out.println(rainWaterTwoPointer(arr2));
    }

    public static int rainWaterTwoPointer(int[] arr) {
        int left = 1;
        int right = arr.length - 2;
        int lmax = arr[left - 1];
        int rmax = arr[right + 1];
        int res = 0;
        while (left <= right) {
            if (rmax <= lmax) {
                res += Math.max(0, rmax - arr[right]);
                rmax = Math.max(rmax, arr[right]);
                right -= 1;
            } else {
                res += Math.max(0, lmax - arr[left]);
                lmax = Math.max(lmax, arr[left]);
                left += 1;
            }
        }
        return res;
    }

   public static int rainWaterBrute(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);
            int right = arr[i];
            for (int j = i+1; j < arr.length; j++)
                right = Math.max(right, arr[j]);
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }



}



