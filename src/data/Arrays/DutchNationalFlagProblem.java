package data.Arrays;

import java.util.Arrays;

public class DutchNationalFlagProblem {

    void main(){

        int[] arr = { 0, 1, 2, 0, 1, 2 };
        int n = arr.length;
        sortColor(arr);
        System.out.println(Arrays.toString(arr));   //[0, 0, 1, 1, 2, 2]


    }

    public void sortColor(int[] arr){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low++]=arr[mid];
                arr[mid++]=temp;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
        }


    }










}
