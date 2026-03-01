package data.Stack;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    /*




     */

    void main(){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxs(nums, k)));


    }

    public static int[] maxs(int[] nums, int k){
        if (nums == null|| k<=0) return new int[0];

        int n=nums.length;
        int[] res= new int[n-k+1];
        Deque<Integer> dq= new LinkedList<>();
        for(int i=0; i<n; i++){
            if(!dq.isEmpty()&& dq.peekFirst()==i-k)
                dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1)
                res[i-k+1] = nums[dq.peekFirst()];
        }
        return res;
    }




}
