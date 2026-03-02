package data.DynamicPrograming;

public class HouseRobber {
    /*
🏠 House Robber
📌 Problem

You are a robber planning to rob houses along a street.
Each house has some money, but adjacent houses cannot be robbed (security system alert 🚨).

Return the maximum amount of money you can rob without robbing two adjacent houses.


     */

    void main() {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));  // Output: 12

    }

    public static int rob(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        int first = 0;
        int second = 0;
        for (int a : arr) {
            int third = Math.max(first, second + a);
            second = first;
            first = third;
        }
        return first;
    }
}
