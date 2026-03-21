package data.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class KthLargest {

    void main(){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kth(nums, k)); // 5


    }
/*
⏱ Complexity:
Time: O(n log n)
Space: O(1)
 */
    public static int findk(int[] arr,int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    /*


     */
    public static int kth(int[] arr,int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int a:arr){
            pq.add(a);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }


    public static int kthInd(ArrayList<Integer> arr, int k){
        int pivot=arr.get(new Random().nextInt(arr.size()));
//        int

        return 0;


    }








}
