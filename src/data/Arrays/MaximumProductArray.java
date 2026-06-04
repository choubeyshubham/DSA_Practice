package data.Arrays;

public class MaximumProductArray {

    void main(){

        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));


    }

    public static int maxProduct(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            int mul=1;
            for(int j=i;j<arr.length;j++){
                mul *=arr[j];
                max=Math.max(max,mul);
            }
        }

    return max;
    }




}
