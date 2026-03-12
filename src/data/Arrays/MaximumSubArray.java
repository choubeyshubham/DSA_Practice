package data.Arrays;

public class MaximumSubArray {

    void main() {

        int[] arr = {2, 3, -8, 7, -1, 2, 3}; // 11
        System.out.println(maxSumOpti(arr));


    }

    public static int maxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int maxSumOpti(int[] arr){
        int curr=arr[0];
        int max=arr[0];
        for (int a : arr) {
            curr = Math.max(a, curr + a);
            max = Math.max(max, curr);

        }
        return max;
    }



















/*
    public static int maxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int res = 0;
            for (int j = i; j < arr.length; j++) {
                res += arr[j];
                max = Math.max(max, res);
            }
        }
        return max;
    }


    public static int maxSumOpti(int[] arr) {
        int max = arr[0];
        int curr = arr[0];

        for (int i = 0; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;

    }
*/

}
