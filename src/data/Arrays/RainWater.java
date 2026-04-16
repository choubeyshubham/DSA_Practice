package data.Arrays;

public class RainWater {


    void main() {
            int[] arr = {3, 0, 1, 0, 4, 0, 2};//10
        int[] arr2 = {2, 1, 5, 3, 1, 0, 4};//9
//        System.out.println(rainWaterTwoPointer(arr));
        System.out.println(container(arr2));
    }

    public static int rainWaterTwoPointer(int[] arr) {
        int left = 1;
        int right = arr.length - 2;
        int lmax = arr[left - 1];
        int rmax = arr[right + 1];
        int res = 0;
        while (left <= right) {
            if (rmax <= lmax) {
                res += Math.max(0, rmax - arr[right]);
                rmax = Math.max(rmax, arr[right]);
                right--;
            } else {
                res += Math.max(0, lmax - arr[left]);
                lmax = Math.max(lmax, arr[left]);
                left++;
            }
        }
        return res;
    }

    public static int container(int[] arr){
        int res=0;
        int left=1;
        int right=arr.length-2;
        int lmax=arr[left-1];
        int rmax=arr[right+1];
        while(left<=right){
            if(rmax<=lmax){
                res +=Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right--;
            }else{
                res +=Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left++;
            }
        }
        return res;
    }

}



