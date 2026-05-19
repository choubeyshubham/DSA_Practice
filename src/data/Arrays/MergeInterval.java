package data.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    void main() {
        /*


         */


        int[][] interval = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};//[[1, 6], [8, 10], [15, 18]]

        System.out.println(Arrays.deepToString(merge(interval)));

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if (currStart <= end)
                end = Math.max(end, currEnd);
            else {
                result.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }


}
