package data.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberInDuplicateArray {
    void main(){

        int[] arr={1,1,1,2,2,3,5,5};
        int n=5;
        System.out.println(missing(arr,n));


    }

    public static int missing(int[] arr,int m){
        Map<Integer,Integer> map= new HashMap<>();
        for(int a:arr)
            map.put(a,map.getOrDefault(a,0)+1);

        for(int i=1;i<arr.length;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }






}
