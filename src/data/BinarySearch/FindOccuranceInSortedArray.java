package data.BinarySearch;

public class FindOccuranceInSortedArray {


    void main(){

        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;

        int frequency = countFrequency(arr, target);
        System.out.println("Frequency of " + target + " is: " + frequency);//4
    }


    // Main function to find total frequency
    public static int countFrequency(int[] arr, int target) {
        int firstIdx = findOccurrence(arr, target, true);

        // If the element is not found, frequency is 0
        if (firstIdx == -1) {
            return 0;
        }

        int lastIdx = findOccurrence(arr, target, false);

        // Total frequency formula
        return lastIdx - firstIdx + 1;
    }

    // Modified Binary Search to find the first or last occurrence
    private static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int low = 0;
        int high = arr.length - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                resultIndex = mid; // Potential answer found

                if (findFirst) {
                    high = mid - 1; // Keep searching left for the first occurrence
                } else {
                    low = mid + 1;  // Keep searching right for the last occurrence
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return resultIndex;
    }


}
