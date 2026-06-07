package data.Arrays;

public class MaximumProductSubArray {

    void main(){

        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));//180


    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
     public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = max(arr[i], arr[i] * max, arr[i] * min);
            min = min(arr[i], arr[i] * max, arr[i] * min);
            max = temp;
            res = Math.max(res, max);
        }

        return res;
    }






    //o(n2) complexity
    public static int max(int[] arr){
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
