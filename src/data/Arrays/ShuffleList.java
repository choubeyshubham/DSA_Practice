package data.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ShuffleList {
    /*



     */

    void main(){

        int[] ls={1,2,3,4,5,6,7,8,9};
        suffle(ls);
        System.out.println(Arrays.toString(ls));
        System.out.println("--------------");



    }
    public static void suffle(int[] arr){
        Random rm= new Random();
        for(int i=0;i<arr.length;i++ ){
            int j=rm.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }






}
