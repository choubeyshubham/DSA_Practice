package data.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class TwoSum {
    void main() {

        int[] arr1 = {0, -1, 2, -3, 1};
//        int[] arr2 = {3, 2, 4};

        int target = -2;
        System.out.println(Arrays.toString(twoHash(arr1, target)));

    }

    //Brute Force
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == target) return new int[]{i, j};
        return new int[]{-1, -1};
    }

    //Optimal Solution
    public static int[] twoSumTwoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target)
                return new int[]{arr[left], arr[right]};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    //HashMap
    public static int[] twoSumHashMap(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp))
                return new int[]{arr[map.get(comp)], arr[i]};
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
//------------------------------------------------------------------------------------------------------

 public static int[] twoHash(int[] arr,int t){
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(t-arr[i])){
            }else{
                map.put(arr[i],1);
            }
        }
        return new int[]{-1,-1};

 }

//---------------------------------------------------------------------------------------
}
