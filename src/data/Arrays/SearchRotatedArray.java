package data.Arrays;

public class SearchRotatedArray {
    void main() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};//8
        int target = 3;
        System.out.println(searchs(arr, target));
    }
    public static int searchs(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) return mid;
            if (arr[left] < arr[mid]) {
                if (t > arr[left] && t < arr[mid]) right--;
                else left++;
            }else{
                if (t > arr[mid] && t < arr[right]) right--;
                else left++;
            }
        }
        return -1;
    }


}
