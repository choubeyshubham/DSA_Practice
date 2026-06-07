package data.Arrays;

public class EquilibriumIndex {
/*
Given an array arr[] of size n, find an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes. When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.

Note: If multiple equilibrium indices exist, return the first one encountered from left to right.

Examples:


Input: arr[] = [1, 2, 0, 3]
Output: 2
Explanation: The sum on the left of index 2 is 1 + 2 = 3 and sum on the right of index 2 is 3.
 */
    void main(){

        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println(equil(arr));//3



    }

    public static int equil(int[] arr){
        int pre=0;
        int total=0;
        for(int a:arr) total +=a;

        for(int i=0;i<arr.length;i++){
            int suff=total-pre-arr[i];
            if(pre==suff) return i;
            pre +=arr[i];
        }
        return -1;
    }








}
