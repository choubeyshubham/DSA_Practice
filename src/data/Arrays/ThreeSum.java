package data.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ThreeSum {
    /*


     */
    void main() {
        int[] nums = {1, 2, -2, 0, -1, 1};
        int target = 1;

        System.out.println(three(nums, target));//[[-2, 1, 2], [-1, 0, 2], [-1, 1, 1]]
    }

    //Optimal
    public static List<List<Integer>> three(int[] arr, int t) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == t) {
                    ls.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    //duplicates
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right++;
                    left++;
                    right--;
                } else if (sum < t) left++;
                else right--;
            }
        }
        return ls;
    }


}
