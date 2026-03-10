package data.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeCharactersByFrequency {

    void main() {

        String s = "tree";
        System.out.println(rearranges(s));


    }


   /* public static String rearrange(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray())
            if (!counts.containsKey(c))
                counts.put(c, counts.getOrDefault(c, 0) + 1);
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(b));
        for (char c : counts.keySet())
            maxHeap.add(c);
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int n = counts.get(c);
            for (int i = 0; i < n; i++)
                sb.append(c);
        }
        return sb.toString();
    }*/


    public static String rearranges(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray())
                count.put(c, count.getOrDefault(c, 0) + 1);
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        for (char c : count.keySet()) maxHeap.add(c);
        StringBuilder res = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            int f = count.get(ch);
            for (int i = 0; i < f; i++) res.append(ch);
        }
        return res.toString();
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Step 2: Use a Max Heap (PriorityQueue) to store characters based on frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        for (char c : counts.keySet()) {
            maxHeap.add(c);
        }

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int frequency = counts.get(c);
            for (int i = 0; i < frequency; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }


}
