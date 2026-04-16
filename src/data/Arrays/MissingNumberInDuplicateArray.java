package data.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberInDuplicateArray {
    void main() {

//        int[] arr1 = {1, 1, 1, 2, 2, 3, 5, 5};
//        int n = 5;
//        System.out.println(missing(arr1, n));
        int[] arr2 = {2, 2, 1, 1, 1, 4};
        System.out.println(missing(arr2));//3



    }

    public static int missing(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr)
            map.put(a, map.getOrDefault(a, 0) + 1);

        for (int i = 1; i < arr.length; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }


    public static int miss(int[] arr){
        //Step 1: mark visited indices
        for(int i=0; i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index]>0){
                arr[index]=-arr[index];
            }
        }

        //Step 2: Find index which is not marked
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return -1;
    }





}
