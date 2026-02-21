package data;

import java.util.Arrays;

public class RotateArray {

    void main(){

        int[] arr={1, 2, 3, 4, 5, 6, 9,10,11,14,16};
        int k=3;


        System.out.println(Arrays.toString(arr));

        rotateArray(arr,k);



    }


    public static void rotateArray(int[] arr,int k){

         k %= arr.length;
        int n = arr.length-1;
        for(int i=0;i<k;i++){
            int last=arr[n];
            for (int j=n;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }

        System.out.println(Arrays.toString(arr));

    }





}
