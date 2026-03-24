package data.Arrays;

public class SearchRotatedArray {
    void main() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};//8
        int target = 3;

        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) return mid;
            if (arr[left] < arr[mid]) {
                if (t > arr[left] && t < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (t > arr[mid] && t < arr[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }



}
