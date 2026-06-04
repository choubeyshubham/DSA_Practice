package data.Heap;

import java.util.*;

public class TopKFrequent {
    /*
Given an array arr[] and a positive integer k, Find the top k elements which have the highest frequency in the array.

Note: If more than one element has same frequency then priorities the larger element over the smaller one.

     */
    void main() {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;
        ArrayList<Integer> res = topKFreq(arr, k);
        Collections.reverse(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println(topKFreq(arr, k));//[1, 4]


    }

    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int val : arr)
            mp.put(val, mp.getOrDefault(val, 0) + 1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.add(new int[]{entry.getValue(), entry.getKey()});
            if (pq.size() > k)
                pq.poll();
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!pq.isEmpty())
            res.add(pq.poll()[1]);
        return res;
    }


}
