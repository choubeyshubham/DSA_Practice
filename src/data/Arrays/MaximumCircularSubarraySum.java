package data.Arrays;

public class MaximumCircularSubarraySum {

    void main(){
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(arr));//22
    }


    public static int maxCircularSum(int[] arr){
        int n=arr.length;
        int res=arr[0];

        for(int i=0;i<n;i++){
            int currSum=0;
            for(int j=0;j<n;j++){
                int idx=(i+j)% n;
                currSum +=arr[idx];
                res=Math.max(res,currSum);
            }

        }

        return res;
    }


}
