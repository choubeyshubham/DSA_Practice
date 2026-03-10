package data.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterInString {
    /*


     */

    void main() {
        String s = "Learn Java Programming";
//        method(s.replaceAll("\\s+", ""));


        s.chars().mapToObj(e->(char)e)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);


    }

    public static void method(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        Set<Character> set = map.keySet();
        for (char c : set) {
            if (map.get(c) > 1)
                System.out.println(c + " " + map.get(c));
        }

    }


}
