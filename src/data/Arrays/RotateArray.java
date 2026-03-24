package data.Arrays;

import java.util.Arrays;

public class RotateArray {

    void main(){

        int[] arr={1, 2, 3, 4, 5, 6, 9,10,11,14,16};
        int k=3;


//        System.out.println(Arrays.toString(arr));

//        rotateArray(arr,k);

        int[] arr2={1,2,3,4,5};
        int k2=2;
        System.out.println(Arrays.toString(rotateArray(arr2,k2)));



    }


    public static int[] rotateArray(int[] arr,int k){
        k %= arr.length;
        for(int i=0;i<k;i++){
            int last=arr[arr.length-1];
            for (int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        return arr;
    }







}
